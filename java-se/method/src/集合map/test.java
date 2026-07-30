package 集合map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        List<String> city1 = new ArrayList<>();
//        city1.add();
//        Collection.addAll(city1,"郑州","开封","洛阳","平顶山","安阳","鹤壁","新乡","焦作","濮阳","许昌","漯河","三门峡","南阳","商丘","信阳","周口","驻马店");
        city1.addAll(List.of("郑州","开封","洛阳","平顶山","安阳","鹤壁","新乡","焦作","濮阳","许昌","漯河","三门峡","南阳","商丘","信阳","周口","驻马店"));
        map.put("河南省",city1);
        System.out.println("map = " + map);
        List<String> city2 = new ArrayList<>();
        city2.addAll(List.of("武汉","黄石","十堰","宜昌","襄樊","鄂州","荆门","孝感","荆州","黄冈","咸宁","随州","恩施","仙桃","天门","潜江","神农架"));
        map.put("湖北省",city2);
        List<String> city3 = new ArrayList<>();
        city3.addAll(List.of("北京","上海","天津","重庆","哈尔滨","长春","沈阳","大连","沈阳","济南","青岛","宁波","温州","绍兴","湖州","嘉兴","金华","衢州","舟山","台州","丽水"));
        map.put("直辖市",city3);
        System.out.println("map2 = " + map);

    }
}
