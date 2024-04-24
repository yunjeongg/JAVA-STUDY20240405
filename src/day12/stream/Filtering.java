package day12.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {

    public static void main(String[] args) {

        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = menuList
                .stream()
                .filter(dish -> dish.isVegeterian())
                .collect(toList());


        dishList.forEach(dish -> {
            System.out.println(dish.getName());
        });

        System.out.println("=======================");

        // 메뉴 목록중에 육류이면서 600칼로리 미만인 요리 필터링해서 출력

        menuList
                .stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT
                        && dish.getCalories() < 600)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링
        System.out.println("===========================");
        menuList
                .stream()
                .filter(d -> d.getName().length() == 4)
                .collect(toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==========================");

        // 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) // 앞에서부터 3개 추출
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==========================");

        // 300칼로리보다 높은 요리 중 처음 2개는 제끼고 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) // 맨앞 2개 제외
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        System.out.println("==========================");

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        // 리스트에서 짝수만 필터링
        List<Integer> integerList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복 제거
                .collect(toList());

        System.out.println(integerList);

    }
}
