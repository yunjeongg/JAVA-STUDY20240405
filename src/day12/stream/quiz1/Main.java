package day12.stream.quiz1;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> tr2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        tr2021.forEach(System.out::println);


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>
        System.out.println("========================");
        Set<String> cities = transactions.stream()
                .map(trs -> trs.getTrader().getCity())
//                .distinct()
                .collect(Collectors.toSet());

        System.out.println(cities);


        // 연습 3: Cambridge에 근무하는 모든 거래자(Trader)를 찾아
        // 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>
        System.out.println("====================================");
        List<Trader> traders = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());

        traders.forEach(System.out::println);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서
        // 알파벳순으로  오름차정렬하여 반환
        // List<String>
        System.out.println("======================");
        List<String> nameList = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
//                .sorted(Comparator.reverseOrder()) // 정렬기준 없을때 내림차
                .sorted()
                .collect(toList());

        System.out.println(nameList);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag1 = transactions.stream()
                .anyMatch(trs -> trs.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println("flag1 = " + flag1);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        System.out.println("=======================");
        int totalValue = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();

        System.out.println("totalValue = " + totalValue);


        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int max = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();

        System.out.println("max = " + max);

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색

//        Transaction minTrs = transactions.get(0);
//        for (Transaction trs : transactions) {
//            if (trs.getValue() < minTrs.getValue()) {
//                minTrs = trs;
//            }
//        }
//        System.out.println("minTrs = " + minTrs);

        /*
        자바의 단점: 널체크 문법이 없음
         */
        Transaction minTransaction = transactions.stream()
                .min(comparing(Transaction::getValue))
                .orElse(null) // 만약 결과가 null일 경우 어케 할거임
                ;

        System.out.println(minTransaction);


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고,
        // 해당 거래의 정보를 출력하시오.
        System.out.println("========================");
        transactions.stream()
                .filter(trs -> trs.getValue() >= 500)
                .collect(toList())
                .forEach(System.out::println);


        // 연습 10. 모든 거래에서 가장 작은 거래액보다
        // 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0

        // 최소거래액 찾기
        int minValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();

        // 평균 구하기
        double average = transactions.stream()
                .filter(trs -> trs.getValue() > minValue)
                .mapToInt(Transaction::getValue)
                .average()
                .getAsDouble();

        System.out.println("average = " + average);


        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래정보들을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}

                const data = {
                    2021: [
                        {
                            trader: {
                                city: '',
                                name: ''
                            },
                            year: 2021,
                            value: 300
                        },
                        {}
                    ],
                    2022: []
                }
         */

        /*
        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .collect(toList());

        List<Transaction> trs2022 = transactions.stream()
                .filter(trs -> trs.getYear() == 2022)
                .collect(toList());

        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);


        System.out.println("=====================");
        Set<Integer> keySet = groupByYearMap.keySet();
//        System.out.println(keySet);


        for (Integer year : keySet) {
            System.out.println("year = " + year);
            List<Transaction> list = groupByYearMap.get(year);
            for (Transaction trs : list) {
                System.out.println(trs);
            }
        }

         */

        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(trs -> trs.getYear()));

        System.out.println("======================");
        cambridgeTrsMap.forEach((key, value) -> {
            System.out.println("year = " + key);
            value.forEach(System.out::println);
        });


        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        System.out.println(max - minValue);

    }



}
