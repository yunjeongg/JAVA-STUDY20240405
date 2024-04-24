package day12.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과중에 원하는 데이터만 추출해서 새로운 리스트로 매핑
public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingApplesByColor(List<Apple> basket) {
        List<Color> colors = new ArrayList<>();
        for (Apple apple : basket) {
            colors.add(apple.getColor());
        }
        return colors;
    }

    // 사과의 무게만 추출
    public static List<Integer> mappingApplesByWeight(List<Apple> basket) {
        List<Integer> weightList = new ArrayList<>();
        for (Apple apple : basket) {
            weightList.add(apple.getWeight());
        }
        return weightList;
    }

    // X객체 리스트에서 Y객체 리스트를 반환
    public static <X, Y> List<Y> map(List<X> xList, GenericFunction<X, Y> f) {

        List<Y> mappedList = new ArrayList<>();
        for (X x : xList) {
            mappedList.add(f.apply(x));
        }
        return mappedList;
    }
}
