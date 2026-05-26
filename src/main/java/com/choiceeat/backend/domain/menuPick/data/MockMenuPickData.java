package com.choiceeat.backend.domain.menuPick.data;

import java.util.List;
import java.util.Map;

public class MockMenuPickData {

    private static final Map<String, String> RESTAURANT_NAMES_BY_KAKAO_PLACE_ID = Map.ofEntries(
                Map.entry("27226419", "성북동면옥집"),
                Map.entry("8218085", "성북동메밀수제비누룽지백숙"),
                Map.entry("1755515956", "태조감자국"),
                Map.entry("23300753", "쌍다리돼지불백 본점"),
                Map.entry("17569573", "삼청각 일화당"),
                Map.entry("7948105", "성북동집"),
                Map.entry("21233686", "동우설렁탕 본점"),
                Map.entry("21526500", "청수장"),
                Map.entry("1925267112", "천막집"),
                Map.entry("24353265", "공푸"),
                Map.entry("25451287", "애정마라샹궈 본점"),
                Map.entry("557188800", "가부 본점"),
                Map.entry("697084504", "라라면가"),
                Map.entry("21401923", "용초수"),
                Map.entry("1841813748", "와라와라양꼬치앤훠궈"),
                Map.entry("2108202354", "짬뽕선수"),
                Map.entry("688654430", "수저가"),
                Map.entry("721426198", "가부 보문점"),
                Map.entry("7960698", "송림원"),
                Map.entry("8238823", "금왕돈까스 본점"),
                Map.entry("7937741", "서울왕돈까스 성북동본점"),
                Map.entry("1271420842", "우토"),
                Map.entry("1746912410", "온달왕돈까스"),
                Map.entry("1540691570", "긴자료코 성신여대점"),
                Map.entry("1992081643", "김태완스시 성신여대"),
                Map.entry("908523329", "스시산 본관"),
                Map.entry("1196036428", "도쿄커틀릿"),
                Map.entry("15917933", "오박사네왕돈까스 본점"),
                Map.entry("456860336", "서민스시"),
                Map.entry("2040703324", "특별식당"),
                Map.entry("485306026", "문화식당"),
                Map.entry("452915279", "쵸이양식"),
                Map.entry("230989806", "벤베누토"),
                Map.entry("1177828422", "빌라드코스테스"),
                Map.entry("1039522002", "르한스"),
                Map.entry("26546805", "버거파크"),
                Map.entry("573428715", "부부셰프"),
                Map.entry("974275602", "라체나1907"),
                Map.entry("923778015", "와이인"),
                Map.entry("2114116437", "보울 델리 앤 이터리"),
                Map.entry("20944335", "옛날중국집"),
                Map.entry("8200924", "국시집"),
                Map.entry("24873082", "명문막국수"),
                Map.entry("8129950", "하단"),
                Map.entry("579222224", "호랑이김밥"),
                Map.entry("1852838507", "한성대양꼬치"),
                Map.entry("335111559", "팔백집 본점"),
                Map.entry("399918679", "동선식당"),
                Map.entry("26869649", "김통"),
                Map.entry("1597826671", "라이라이라이 성신여대점"),
                Map.entry("1008497143", "치치 성신여대점"),
                Map.entry("15424746", "샌드위치 하우스"),
                Map.entry("7866028", "마늘과올리브 성신여대점"),
                Map.entry("27089788", "윤휘식당"),
                Map.entry("571922427", "오르비에토"),
                Map.entry("1323483346", "구스"),
                Map.entry("27495320", "모두와"),
                Map.entry("13086789", "고른햇살"),
                Map.entry("1819200119", "탱글이문어"),
                Map.entry("11160925", "전통만두국"),
                Map.entry("13693145", "북경양꼬치"),
                Map.entry("2134375760", "언니네반점"),
                Map.entry("927297064", "야마토텐동"),
                Map.entry("946837172", "삼성통닭"),
                Map.entry("2074141616", "나그네파전"),
                Map.entry("10501014", "서울쌈냉면 고대점"),
                Map.entry("60259859", "이공김밥"),
                Map.entry("21324889", "맥도날드 안암점"),
                Map.entry("14512484", "유자유김치떡볶이 본점"),
                Map.entry("15546985", "BIYA부대찌개 본점"),
                Map.entry("24449631", "별난주점 고대안암점"),
                Map.entry("1949561591", "청년밥상문간"),
                Map.entry("16819186", "동방손칼국수"),
                Map.entry("13007118", "바람난오리궁뎅이"),
                Map.entry("25671309", "대왕유통직영 셀프민물장어"),
                Map.entry("15796495", "전주콩나물국밥 본점"),
                Map.entry("186578604", "정가네지짐이"),
                Map.entry("1962671869", "할머니만두국"),
                Map.entry("10380858", "봉화묵집"),
                Map.entry("1536393758", "마몽함박"),
                Map.entry("10447001", "산장두부촌"),
                Map.entry("1555591848", "정릉곤드레밥"),
                Map.entry("23296143", "옛날칼국수"),
                Map.entry("1371384450", "미미가"),
                Map.entry("1823707163", "엽기꼼닭발"),
                Map.entry("17893699", "백두한우곱창전문"),
                Map.entry("2050246779", "제주고깃집 성북구청점"),
                Map.entry("7988170", "안동반점"),
                Map.entry("10644213", "영순관"),
                Map.entry("731249424", "윤김밥"),
                Map.entry("1702681001", "보문 다판지"),
                Map.entry("1649096796", "풍천장어셀프직판장"),
                Map.entry("15623027", "신진원"),
                Map.entry("25401969", "모모곱창"),
                Map.entry("402903717", "고기싸롱 보문역점"),
                Map.entry("1016028633", "금산닭집"),
                Map.entry("11744410", "미운오리"),
                Map.entry("843250339", "포썸"),
                Map.entry("389501703", "프릭타이"),
                Map.entry("1328344498", "고랭 돌곶이점"),
                Map.entry("192029925", "동방"),
                Map.entry("12768652", "포앤시드니 성신여대점"),
                Map.entry("1300657734", "포옹남 하월곡점"),
                Map.entry("2004094531", "비타포"),
                Map.entry("27778238", "퍼스트38"),
                Map.entry("1605018985", "누들아한타이 동덕여대점"),
                Map.entry("182767122", "미분당 성신여대점"),
                Map.entry("1286204634", "서울방콕"),
                Map.entry("758126508", "리틀방콕 길음뉴타운점")
    );

    private static final Map<String, List<MockMenuPick>> MENUS_BY_KAKAO_PLACE_ID = Map.ofEntries(
                Map.entry(
                        "27226419",
                        List.of(
                        new MockMenuPick("갈비탕", 7000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=27226419-1"),
                        new MockMenuPick("된장찌개", 11000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=27226419-2"),
                        new MockMenuPick("설렁탕", 16000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=27226419-3")
                        )
                ),
                Map.entry(
                        "8218085",
                        List.of(
                        new MockMenuPick("제육볶음", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=8218085-1"),
                        new MockMenuPick("갈비탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=8218085-2"),
                        new MockMenuPick("감자탕", 15000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=8218085-3")
                        )
                ),
                Map.entry(
                        "1755515956",
                        List.of(
                        new MockMenuPick("비빔밥", 16000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=1755515956-1"),
                        new MockMenuPick("제육볶음", 7000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=1755515956-2"),
                        new MockMenuPick("설렁탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=1755515956-3")
                        )
                ),
                Map.entry(
                        "23300753",
                        List.of(
                        new MockMenuPick("감자탕", 16000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=23300753-1"),
                        new MockMenuPick("김치찌개", 7000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=23300753-2"),
                        new MockMenuPick("갈비탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=23300753-3")
                        )
                ),
                Map.entry(
                        "17569573",
                        List.of(
                        new MockMenuPick("설렁탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=17569573-1"),
                        new MockMenuPick("비빔밥", 16000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=17569573-2"),
                        new MockMenuPick("김치찌개", 7000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=17569573-3")
                        )
                ),
                Map.entry(
                        "7948105",
                        List.of(
                        new MockMenuPick("감자탕", 9000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=7948105-1"),
                        new MockMenuPick("제육볶음", 15000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=7948105-2"),
                        new MockMenuPick("비빔밥", 22000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=7948105-3")
                        )
                ),
                Map.entry(
                        "21233686",
                        List.of(
                        new MockMenuPick("설렁탕", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=21233686-1"),
                        new MockMenuPick("갈비탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=21233686-2"),
                        new MockMenuPick("돼지불백", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=21233686-3")
                        )
                ),
                Map.entry(
                        "21526500",
                        List.of(
                        new MockMenuPick("된장찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=21526500-1"),
                        new MockMenuPick("제육볶음", 30000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=21526500-2"),
                        new MockMenuPick("수제비", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=21526500-3")
                        )
                ),
                Map.entry(
                        "1925267112",
                        List.of(
                        new MockMenuPick("설렁탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=1925267112-1"),
                        new MockMenuPick("수제비", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=1925267112-2"),
                        new MockMenuPick("불고기정식", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=1925267112-3")
                        )
                ),
                Map.entry(
                        "24353265",
                        List.of(
                        new MockMenuPick("볶음밥", 14000, "https://source.unsplash.com/320x240/?chinese-food,%EB%B3%B6%EC%9D%8C%EB%B0%A5&sig=24353265-1"),
                        new MockMenuPick("꿔바로우", 22000, "https://source.unsplash.com/320x240/?chinese-food,%EA%BF%94%EB%B0%94%EB%A1%9C%EC%9A%B0&sig=24353265-2"),
                        new MockMenuPick("고추잡채", 32000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B3%A0%EC%B6%94%EC%9E%A1%EC%B1%84&sig=24353265-3")
                        )
                ),
                Map.entry(
                        "25451287",
                        List.of(
                        new MockMenuPick("탕수육", 16000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=25451287-1"),
                        new MockMenuPick("짬뽕", 10000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%AC%EB%BD%95&sig=25451287-2"),
                        new MockMenuPick("볶음밥", 24000, "https://source.unsplash.com/320x240/?chinese-food,%EB%B3%B6%EC%9D%8C%EB%B0%A5&sig=25451287-3")
                        )
                ),
                Map.entry(
                        "557188800",
                        List.of(
                        new MockMenuPick("마라샹궈", 12000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=557188800-1"),
                        new MockMenuPick("볶음밥", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EB%B3%B6%EC%9D%8C%EB%B0%A5&sig=557188800-2"),
                        new MockMenuPick("짜장면", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%9C%EC%9E%A5%EB%A9%B4&sig=557188800-3")
                        )
                ),
                Map.entry(
                        "697084504",
                        List.of(
                        new MockMenuPick("짬뽕", 32000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%AC%EB%BD%95&sig=697084504-1"),
                        new MockMenuPick("꿔바로우", 22000, "https://source.unsplash.com/320x240/?chinese-food,%EA%BF%94%EB%B0%94%EB%A1%9C%EC%9A%B0&sig=697084504-2"),
                        new MockMenuPick("볶음밥", 14000, "https://source.unsplash.com/320x240/?chinese-food,%EB%B3%B6%EC%9D%8C%EB%B0%A5&sig=697084504-3")
                        )
                ),
                Map.entry(
                        "21401923",
                        List.of(
                        new MockMenuPick("양꼬치", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EC%96%91%EA%BC%AC%EC%B9%98&sig=21401923-1"),
                        new MockMenuPick("짜장면", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%9C%EC%9E%A5%EB%A9%B4&sig=21401923-2"),
                        new MockMenuPick("마라샹궈", 12000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=21401923-3")
                        )
                ),
                Map.entry(
                        "1841813748",
                        List.of(
                        new MockMenuPick("군만두", 10000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=1841813748-1"),
                        new MockMenuPick("탕수육", 16000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=1841813748-2"),
                        new MockMenuPick("고추잡채", 24000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B3%A0%EC%B6%94%EC%9E%A1%EC%B1%84&sig=1841813748-3")
                        )
                ),
                Map.entry(
                        "2108202354",
                        List.of(
                        new MockMenuPick("짜장면", 16000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%9C%EC%9E%A5%EB%A9%B4&sig=2108202354-1"),
                        new MockMenuPick("고추잡채", 10000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B3%A0%EC%B6%94%EC%9E%A1%EC%B1%84&sig=2108202354-2"),
                        new MockMenuPick("꿔바로우", 24000, "https://source.unsplash.com/320x240/?chinese-food,%EA%BF%94%EB%B0%94%EB%A1%9C%EC%9A%B0&sig=2108202354-3")
                        )
                ),
                Map.entry(
                        "688654430",
                        List.of(
                        new MockMenuPick("마라탕", 30000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%ED%83%95&sig=688654430-1"),
                        new MockMenuPick("마라샹궈", 20000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=688654430-2"),
                        new MockMenuPick("짬뽕", 12000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%AC%EB%BD%95&sig=688654430-3")
                        )
                ),
                Map.entry(
                        "721426198",
                        List.of(
                        new MockMenuPick("마라샹궈", 14000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=721426198-1"),
                        new MockMenuPick("군만두", 32000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=721426198-2"),
                        new MockMenuPick("볶음밥", 22000, "https://source.unsplash.com/320x240/?chinese-food,%EB%B3%B6%EC%9D%8C%EB%B0%A5&sig=721426198-3")
                        )
                ),
                Map.entry(
                        "7960698",
                        List.of(
                        new MockMenuPick("짬뽕", 14000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%AC%EB%BD%95&sig=7960698-1"),
                        new MockMenuPick("탕수육", 32000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=7960698-2"),
                        new MockMenuPick("군만두", 22000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=7960698-3")
                        )
                ),
                Map.entry(
                        "8238823",
                        List.of(
                        new MockMenuPick("카레라이스", 28000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B9%B4%EB%A0%88%EB%9D%BC%EC%9D%B4%EC%8A%A4&sig=8238823-1"),
                        new MockMenuPick("우동", 12000, "https://source.unsplash.com/320x240/?japanese-food,%EC%9A%B0%EB%8F%99&sig=8238823-2"),
                        new MockMenuPick("초밥세트", 19000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B4%88%EB%B0%A5%EC%84%B8%ED%8A%B8&sig=8238823-3")
                        )
                ),
                Map.entry(
                        "7937741",
                        List.of(
                        new MockMenuPick("규동", 19000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B7%9C%EB%8F%99&sig=7937741-1"),
                        new MockMenuPick("돈카츠", 12000, "https://source.unsplash.com/320x240/?japanese-food,%EB%8F%88%EC%B9%B4%EC%B8%A0&sig=7937741-2"),
                        new MockMenuPick("가츠동", 28000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B0%80%EC%B8%A0%EB%8F%99&sig=7937741-3")
                        )
                ),
                Map.entry(
                        "1271420842",
                        List.of(
                        new MockMenuPick("모밀", 38000, "https://source.unsplash.com/320x240/?japanese-food,%EB%AA%A8%EB%B0%80&sig=1271420842-1"),
                        new MockMenuPick("텐동", 26000, "https://source.unsplash.com/320x240/?japanese-food,%ED%85%90%EB%8F%99&sig=1271420842-2"),
                        new MockMenuPick("가츠동", 16000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B0%80%EC%B8%A0%EB%8F%99&sig=1271420842-3")
                        )
                ),
                Map.entry(
                        "1746912410",
                        List.of(
                        new MockMenuPick("가츠동", 26000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B0%80%EC%B8%A0%EB%8F%99&sig=1746912410-1"),
                        new MockMenuPick("카레라이스", 38000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B9%B4%EB%A0%88%EB%9D%BC%EC%9D%B4%EC%8A%A4&sig=1746912410-2"),
                        new MockMenuPick("텐동", 16000, "https://source.unsplash.com/320x240/?japanese-food,%ED%85%90%EB%8F%99&sig=1746912410-3")
                        )
                ),
                Map.entry(
                        "1540691570",
                        List.of(
                        new MockMenuPick("텐동", 16000, "https://source.unsplash.com/320x240/?japanese-food,%ED%85%90%EB%8F%99&sig=1540691570-1"),
                        new MockMenuPick("라멘", 38000, "https://source.unsplash.com/320x240/?japanese-food,%EB%9D%BC%EB%A9%98&sig=1540691570-2"),
                        new MockMenuPick("사케동", 26000, "https://source.unsplash.com/320x240/?japanese-food,%EC%82%AC%EC%BC%80%EB%8F%99&sig=1540691570-3")
                        )
                ),
                Map.entry(
                        "1992081643",
                        List.of(
                        new MockMenuPick("사케동", 26000, "https://source.unsplash.com/320x240/?japanese-food,%EC%82%AC%EC%BC%80%EB%8F%99&sig=1992081643-1"),
                        new MockMenuPick("우동", 16000, "https://source.unsplash.com/320x240/?japanese-food,%EC%9A%B0%EB%8F%99&sig=1992081643-2"),
                        new MockMenuPick("초밥세트", 38000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B4%88%EB%B0%A5%EC%84%B8%ED%8A%B8&sig=1992081643-3")
                        )
                ),
                Map.entry(
                        "908523329",
                        List.of(
                        new MockMenuPick("가츠동", 19000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B0%80%EC%B8%A0%EB%8F%99&sig=908523329-1"),
                        new MockMenuPick("모밀", 28000, "https://source.unsplash.com/320x240/?japanese-food,%EB%AA%A8%EB%B0%80&sig=908523329-2"),
                        new MockMenuPick("돈카츠", 12000, "https://source.unsplash.com/320x240/?japanese-food,%EB%8F%88%EC%B9%B4%EC%B8%A0&sig=908523329-3")
                        )
                ),
                Map.entry(
                        "1196036428",
                        List.of(
                        new MockMenuPick("사케동", 13000, "https://source.unsplash.com/320x240/?japanese-food,%EC%82%AC%EC%BC%80%EB%8F%99&sig=1196036428-1"),
                        new MockMenuPick("초밥세트", 9000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B4%88%EB%B0%A5%EC%84%B8%ED%8A%B8&sig=1196036428-2"),
                        new MockMenuPick("텐동", 19000, "https://source.unsplash.com/320x240/?japanese-food,%ED%85%90%EB%8F%99&sig=1196036428-3")
                        )
                ),
                Map.entry(
                        "15917933",
                        List.of(
                        new MockMenuPick("사케동", 13000, "https://source.unsplash.com/320x240/?japanese-food,%EC%82%AC%EC%BC%80%EB%8F%99&sig=15917933-1"),
                        new MockMenuPick("가츠동", 9000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B0%80%EC%B8%A0%EB%8F%99&sig=15917933-2"),
                        new MockMenuPick("초밥세트", 19000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B4%88%EB%B0%A5%EC%84%B8%ED%8A%B8&sig=15917933-3")
                        )
                ),
                Map.entry(
                        "456860336",
                        List.of(
                        new MockMenuPick("라멘", 28000, "https://source.unsplash.com/320x240/?japanese-food,%EB%9D%BC%EB%A9%98&sig=456860336-1"),
                        new MockMenuPick("카레라이스", 19000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B9%B4%EB%A0%88%EB%9D%BC%EC%9D%B4%EC%8A%A4&sig=456860336-2"),
                        new MockMenuPick("우동", 12000, "https://source.unsplash.com/320x240/?japanese-food,%EC%9A%B0%EB%8F%99&sig=456860336-3")
                        )
                ),
                Map.entry(
                        "2040703324",
                        List.of(
                        new MockMenuPick("돼지불백", 9000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=2040703324-1"),
                        new MockMenuPick("된장찌개", 22000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=2040703324-2"),
                        new MockMenuPick("비빔밥", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=2040703324-3")
                        )
                ),
                Map.entry(
                        "485306026",
                        List.of(
                        new MockMenuPick("토마토 파스타", 18000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=485306026-1"),
                        new MockMenuPick("오믈렛", 12000, "https://source.unsplash.com/320x240/?western-food,%EC%98%A4%EB%AF%88%EB%A0%9B&sig=485306026-2"),
                        new MockMenuPick("스테이크", 26000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=485306026-3")
                        )
                ),
                Map.entry(
                        "452915279",
                        List.of(
                        new MockMenuPick("스테이크", 20000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=452915279-1"),
                        new MockMenuPick("버거", 32000, "https://source.unsplash.com/320x240/?western-food,%EB%B2%84%EA%B1%B0&sig=452915279-2"),
                        new MockMenuPick("리조또", 45000, "https://source.unsplash.com/320x240/?western-food,%EB%A6%AC%EC%A1%B0%EB%98%90&sig=452915279-3")
                        )
                ),
                Map.entry(
                        "230989806",
                        List.of(
                        new MockMenuPick("라자냐", 26000, "https://source.unsplash.com/320x240/?western-food,%EB%9D%BC%EC%9E%90%EB%83%90&sig=230989806-1"),
                        new MockMenuPick("스테이크", 12000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=230989806-2"),
                        new MockMenuPick("토마토 파스타", 18000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=230989806-3")
                        )
                ),
                Map.entry(
                        "1177828422",
                        List.of(
                        new MockMenuPick("스테이크", 32000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=1177828422-1"),
                        new MockMenuPick("버거", 20000, "https://source.unsplash.com/320x240/?western-food,%EB%B2%84%EA%B1%B0&sig=1177828422-2"),
                        new MockMenuPick("토마토 파스타", 45000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=1177828422-3")
                        )
                ),
                Map.entry(
                        "1039522002",
                        List.of(
                        new MockMenuPick("스테이크", 24000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=1039522002-1"),
                        new MockMenuPick("크림 파스타", 35000, "https://source.unsplash.com/320x240/?western-food,%ED%81%AC%EB%A6%BC%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=1039522002-2"),
                        new MockMenuPick("필라프", 15000, "https://source.unsplash.com/320x240/?western-food,%ED%95%84%EB%9D%BC%ED%94%84&sig=1039522002-3")
                        )
                ),
                Map.entry(
                        "26546805",
                        List.of(
                        new MockMenuPick("필라프", 12000, "https://source.unsplash.com/320x240/?western-food,%ED%95%84%EB%9D%BC%ED%94%84&sig=26546805-1"),
                        new MockMenuPick("오믈렛", 18000, "https://source.unsplash.com/320x240/?western-food,%EC%98%A4%EB%AF%88%EB%A0%9B&sig=26546805-2"),
                        new MockMenuPick("버거", 26000, "https://source.unsplash.com/320x240/?western-food,%EB%B2%84%EA%B1%B0&sig=26546805-3")
                        )
                ),
                Map.entry(
                        "573428715",
                        List.of(
                        new MockMenuPick("피자", 35000, "https://source.unsplash.com/320x240/?western-food,%ED%94%BC%EC%9E%90&sig=573428715-1"),
                        new MockMenuPick("토마토 파스타", 15000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=573428715-2"),
                        new MockMenuPick("버거", 24000, "https://source.unsplash.com/320x240/?western-food,%EB%B2%84%EA%B1%B0&sig=573428715-3")
                        )
                ),
                Map.entry(
                        "974275602",
                        List.of(
                        new MockMenuPick("리조또", 35000, "https://source.unsplash.com/320x240/?western-food,%EB%A6%AC%EC%A1%B0%EB%98%90&sig=974275602-1"),
                        new MockMenuPick("스테이크", 15000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=974275602-2"),
                        new MockMenuPick("샐러드", 24000, "https://source.unsplash.com/320x240/?western-food,%EC%83%90%EB%9F%AC%EB%93%9C&sig=974275602-3")
                        )
                ),
                Map.entry(
                        "923778015",
                        List.of(
                        new MockMenuPick("리조또", 32000, "https://source.unsplash.com/320x240/?western-food,%EB%A6%AC%EC%A1%B0%EB%98%90&sig=923778015-1"),
                        new MockMenuPick("피자", 45000, "https://source.unsplash.com/320x240/?western-food,%ED%94%BC%EC%9E%90&sig=923778015-2"),
                        new MockMenuPick("토마토 파스타", 20000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=923778015-3")
                        )
                ),
                Map.entry(
                        "2114116437",
                        List.of(
                        new MockMenuPick("스테이크", 45000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=2114116437-1"),
                        new MockMenuPick("리조또", 20000, "https://source.unsplash.com/320x240/?western-food,%EB%A6%AC%EC%A1%B0%EB%98%90&sig=2114116437-2"),
                        new MockMenuPick("샐러드", 32000, "https://source.unsplash.com/320x240/?western-food,%EC%83%90%EB%9F%AC%EB%93%9C&sig=2114116437-3")
                        )
                ),
                Map.entry(
                        "20944335",
                        List.of(
                        new MockMenuPick("양꼬치", 22000, "https://source.unsplash.com/320x240/?chinese-food,%EC%96%91%EA%BC%AC%EC%B9%98&sig=20944335-1"),
                        new MockMenuPick("군만두", 32000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=20944335-2"),
                        new MockMenuPick("탕수육", 14000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=20944335-3")
                        )
                ),
                Map.entry(
                        "8200924",
                        List.of(
                        new MockMenuPick("제육볶음", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=8200924-1"),
                        new MockMenuPick("김치찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=8200924-2"),
                        new MockMenuPick("된장찌개", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=8200924-3")
                        )
                ),
                Map.entry(
                        "24873082",
                        List.of(
                        new MockMenuPick("비빔밥", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=24873082-1"),
                        new MockMenuPick("된장찌개", 9000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=24873082-2"),
                        new MockMenuPick("갈비탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=24873082-3")
                        )
                ),
                Map.entry(
                        "8129950",
                        List.of(
                        new MockMenuPick("갈비탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=8129950-1"),
                        new MockMenuPick("감자탕", 16000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=8129950-2"),
                        new MockMenuPick("된장찌개", 7000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=8129950-3")
                        )
                ),
                Map.entry(
                        "579222224",
                        List.of(
                        new MockMenuPick("돼지불백", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=579222224-1"),
                        new MockMenuPick("비빔밥", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=579222224-2"),
                        new MockMenuPick("불고기정식", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=579222224-3")
                        )
                ),
                Map.entry(
                        "1852838507",
                        List.of(
                        new MockMenuPick("군만두", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=1852838507-1"),
                        new MockMenuPick("고추잡채", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B3%A0%EC%B6%94%EC%9E%A1%EC%B1%84&sig=1852838507-2"),
                        new MockMenuPick("탕수육", 12000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=1852838507-3")
                        )
                ),
                Map.entry(
                        "335111559",
                        List.of(
                        new MockMenuPick("돼지불백", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=335111559-1"),
                        new MockMenuPick("갈비탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=335111559-2"),
                        new MockMenuPick("설렁탕", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=335111559-3")
                        )
                ),
                Map.entry(
                        "399918679",
                        List.of(
                        new MockMenuPick("비빔밥", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=399918679-1"),
                        new MockMenuPick("김치찌개", 12000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=399918679-2"),
                        new MockMenuPick("감자탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=399918679-3")
                        )
                ),
                Map.entry(
                        "26869649",
                        List.of(
                        new MockMenuPick("갈비탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=26869649-1"),
                        new MockMenuPick("김치찌개", 15000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=26869649-2"),
                        new MockMenuPick("제육볶음", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=26869649-3")
                        )
                ),
                Map.entry(
                        "1597826671",
                        List.of(
                        new MockMenuPick("샌드위치", 30000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%83%8C%EB%93%9C%EC%9C%84%EC%B9%98&sig=1597826671-1"),
                        new MockMenuPick("시그니처 세트", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=1597826671-2"),
                        new MockMenuPick("버거 세트", 20000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B2%84%EA%B1%B0%20%EC%84%B8%ED%8A%B8&sig=1597826671-3")
                        )
                ),
                Map.entry(
                        "1008497143",
                        List.of(
                        new MockMenuPick("갈비탕", 12000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=1008497143-1"),
                        new MockMenuPick("설렁탕", 20000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=1008497143-2"),
                        new MockMenuPick("김치찌개", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=1008497143-3")
                        )
                ),
                Map.entry(
                        "15424746",
                        List.of(
                        new MockMenuPick("시그니처 세트", 11000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=15424746-1"),
                        new MockMenuPick("커피 세트", 7000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%BB%A4%ED%94%BC%20%EC%84%B8%ED%8A%B8&sig=15424746-2"),
                        new MockMenuPick("떡볶이", 16000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=15424746-3")
                        )
                ),
                Map.entry(
                        "7866028",
                        List.of(
                        new MockMenuPick("버거", 12000, "https://source.unsplash.com/320x240/?western-food,%EB%B2%84%EA%B1%B0&sig=7866028-1"),
                        new MockMenuPick("토마토 파스타", 18000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=7866028-2"),
                        new MockMenuPick("샐러드", 26000, "https://source.unsplash.com/320x240/?western-food,%EC%83%90%EB%9F%AC%EB%93%9C&sig=7866028-3")
                        )
                ),
                Map.entry(
                        "27089788",
                        List.of(
                        new MockMenuPick("규동", 38000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B7%9C%EB%8F%99&sig=27089788-1"),
                        new MockMenuPick("사케동", 16000, "https://source.unsplash.com/320x240/?japanese-food,%EC%82%AC%EC%BC%80%EB%8F%99&sig=27089788-2"),
                        new MockMenuPick("텐동", 26000, "https://source.unsplash.com/320x240/?japanese-food,%ED%85%90%EB%8F%99&sig=27089788-3")
                        )
                ),
                Map.entry(
                        "571922427",
                        List.of(
                        new MockMenuPick("피자", 20000, "https://source.unsplash.com/320x240/?western-food,%ED%94%BC%EC%9E%90&sig=571922427-1"),
                        new MockMenuPick("크림 파스타", 32000, "https://source.unsplash.com/320x240/?western-food,%ED%81%AC%EB%A6%BC%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=571922427-2"),
                        new MockMenuPick("토마토 파스타", 45000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=571922427-3")
                        )
                ),
                Map.entry(
                        "1323483346",
                        List.of(
                        new MockMenuPick("가츠동", 16000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B0%80%EC%B8%A0%EB%8F%99&sig=1323483346-1"),
                        new MockMenuPick("초밥세트", 7000, "https://source.unsplash.com/320x240/?japanese-food,%EC%B4%88%EB%B0%A5%EC%84%B8%ED%8A%B8&sig=1323483346-2"),
                        new MockMenuPick("돈카츠", 11000, "https://source.unsplash.com/320x240/?japanese-food,%EB%8F%88%EC%B9%B4%EC%B8%A0&sig=1323483346-3")
                        )
                ),
                Map.entry(
                        "27495320",
                        List.of(
                        new MockMenuPick("된장찌개", 11000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=27495320-1"),
                        new MockMenuPick("감자탕", 7000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=27495320-2"),
                        new MockMenuPick("김치찌개", 16000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=27495320-3")
                        )
                ),
                Map.entry(
                        "13086789",
                        List.of(
                        new MockMenuPick("제육볶음", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=13086789-1"),
                        new MockMenuPick("갈비탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=13086789-2"),
                        new MockMenuPick("김치찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=13086789-3")
                        )
                ),
                Map.entry(
                        "1819200119",
                        List.of(
                        new MockMenuPick("불고기정식", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=1819200119-1"),
                        new MockMenuPick("비빔밥", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=1819200119-2"),
                        new MockMenuPick("설렁탕", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=1819200119-3")
                        )
                ),
                Map.entry(
                        "11160925",
                        List.of(
                        new MockMenuPick("설렁탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=11160925-1"),
                        new MockMenuPick("감자탕", 12000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=11160925-2"),
                        new MockMenuPick("갈비탕", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=11160925-3")
                        )
                ),
                Map.entry(
                        "13693145",
                        List.of(
                        new MockMenuPick("양꼬치", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EC%96%91%EA%BC%AC%EC%B9%98&sig=13693145-1"),
                        new MockMenuPick("고추잡채", 12000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B3%A0%EC%B6%94%EC%9E%A1%EC%B1%84&sig=13693145-2"),
                        new MockMenuPick("마라탕", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%ED%83%95&sig=13693145-3")
                        )
                ),
                Map.entry(
                        "2134375760",
                        List.of(
                        new MockMenuPick("탕수육", 12000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=2134375760-1"),
                        new MockMenuPick("마라샹궈", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=2134375760-2"),
                        new MockMenuPick("양꼬치", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EC%96%91%EA%BC%AC%EC%B9%98&sig=2134375760-3")
                        )
                ),
                Map.entry(
                        "927297064",
                        List.of(
                        new MockMenuPick("모밀", 13000, "https://source.unsplash.com/320x240/?japanese-food,%EB%AA%A8%EB%B0%80&sig=927297064-1"),
                        new MockMenuPick("텐동", 9000, "https://source.unsplash.com/320x240/?japanese-food,%ED%85%90%EB%8F%99&sig=927297064-2"),
                        new MockMenuPick("규동", 19000, "https://source.unsplash.com/320x240/?japanese-food,%EA%B7%9C%EB%8F%99&sig=927297064-3")
                        )
                ),
                Map.entry(
                        "946837172",
                        List.of(
                        new MockMenuPick("제육볶음", 30000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=946837172-1"),
                        new MockMenuPick("된장찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=946837172-2"),
                        new MockMenuPick("수제비", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=946837172-3")
                        )
                ),
                Map.entry(
                        "2074141616",
                        List.of(
                        new MockMenuPick("불고기정식", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=2074141616-1"),
                        new MockMenuPick("감자탕", 12000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=2074141616-2"),
                        new MockMenuPick("설렁탕", 20000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=2074141616-3")
                        )
                ),
                Map.entry(
                        "10501014",
                        List.of(
                        new MockMenuPick("비빔밥", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=10501014-1"),
                        new MockMenuPick("돼지불백", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=10501014-2"),
                        new MockMenuPick("감자탕", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=10501014-3")
                        )
                ),
                Map.entry(
                        "60259859",
                        List.of(
                        new MockMenuPick("설렁탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=60259859-1"),
                        new MockMenuPick("김치찌개", 15000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=60259859-2"),
                        new MockMenuPick("제육볶음", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=60259859-3")
                        )
                ),
                Map.entry(
                        "21324889",
                        List.of(
                        new MockMenuPick("떡볶이", 8000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=21324889-1"),
                        new MockMenuPick("시그니처 세트", 4000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=21324889-2"),
                        new MockMenuPick("대표 메뉴", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%8C%80%ED%91%9C%20%EB%A9%94%EB%89%B4&sig=21324889-3")
                        )
                ),
                Map.entry(
                        "14512484",
                        List.of(
                        new MockMenuPick("설렁탕", 20000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=14512484-1"),
                        new MockMenuPick("돼지불백", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=14512484-2"),
                        new MockMenuPick("감자탕", 12000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=14512484-3")
                        )
                ),
                Map.entry(
                        "15546985",
                        List.of(
                        new MockMenuPick("수제비", 16000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=15546985-1"),
                        new MockMenuPick("감자탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=15546985-2"),
                        new MockMenuPick("설렁탕", 7000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=15546985-3")
                        )
                ),
                Map.entry(
                        "24449631",
                        List.of(
                        new MockMenuPick("제육볶음", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=24449631-1"),
                        new MockMenuPick("불고기정식", 22000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=24449631-2"),
                        new MockMenuPick("갈비탕", 15000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=24449631-3")
                        )
                ),
                Map.entry(
                        "1949561591",
                        List.of(
                        new MockMenuPick("김치찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=1949561591-1"),
                        new MockMenuPick("제육볶음", 30000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=1949561591-2"),
                        new MockMenuPick("돼지불백", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=1949561591-3")
                        )
                ),
                Map.entry(
                        "16819186",
                        List.of(
                        new MockMenuPick("된장찌개", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=16819186-1"),
                        new MockMenuPick("수제비", 20000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=16819186-2"),
                        new MockMenuPick("불고기정식", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=16819186-3")
                        )
                ),
                Map.entry(
                        "13007118",
                        List.of(
                        new MockMenuPick("비빔밥", 9000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=13007118-1"),
                        new MockMenuPick("된장찌개", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=13007118-2"),
                        new MockMenuPick("제육볶음", 22000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=13007118-3")
                        )
                ),
                Map.entry(
                        "25671309",
                        List.of(
                        new MockMenuPick("감자탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=25671309-1"),
                        new MockMenuPick("불고기정식", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=25671309-2"),
                        new MockMenuPick("된장찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=25671309-3")
                        )
                ),
                Map.entry(
                        "15796495",
                        List.of(
                        new MockMenuPick("불고기정식", 20000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=15796495-1"),
                        new MockMenuPick("감자탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=15796495-2"),
                        new MockMenuPick("돼지불백", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=15796495-3")
                        )
                ),
                Map.entry(
                        "186578604",
                        List.of(
                        new MockMenuPick("수제비", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=186578604-1"),
                        new MockMenuPick("설렁탕", 22000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=186578604-2"),
                        new MockMenuPick("된장찌개", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=186578604-3")
                        )
                ),
                Map.entry(
                        "1962671869",
                        List.of(
                        new MockMenuPick("비빔밥", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=1962671869-1"),
                        new MockMenuPick("불고기정식", 22000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=1962671869-2"),
                        new MockMenuPick("수제비", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=1962671869-3")
                        )
                ),
                Map.entry(
                        "10380858",
                        List.of(
                        new MockMenuPick("불고기정식", 7000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=10380858-1"),
                        new MockMenuPick("돼지불백", 11000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=10380858-2"),
                        new MockMenuPick("설렁탕", 16000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=10380858-3")
                        )
                ),
                Map.entry(
                        "1536393758",
                        List.of(
                        new MockMenuPick("리조또", 20000, "https://source.unsplash.com/320x240/?western-food,%EB%A6%AC%EC%A1%B0%EB%98%90&sig=1536393758-1"),
                        new MockMenuPick("스테이크", 45000, "https://source.unsplash.com/320x240/?western-food,%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC&sig=1536393758-2"),
                        new MockMenuPick("토마토 파스타", 32000, "https://source.unsplash.com/320x240/?western-food,%ED%86%A0%EB%A7%88%ED%86%A0%20%ED%8C%8C%EC%8A%A4%ED%83%80&sig=1536393758-3")
                        )
                ),
                Map.entry(
                        "10447001",
                        List.of(
                        new MockMenuPick("제육볶음", 22000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=10447001-1"),
                        new MockMenuPick("불고기정식", 9000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=10447001-2"),
                        new MockMenuPick("수제비", 15000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=10447001-3")
                        )
                ),
                Map.entry(
                        "1555591848",
                        List.of(
                        new MockMenuPick("된장찌개", 30000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=1555591848-1"),
                        new MockMenuPick("불고기정식", 12000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=1555591848-2"),
                        new MockMenuPick("김치찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=1555591848-3")
                        )
                ),
                Map.entry(
                        "23296143",
                        List.of(
                        new MockMenuPick("불고기정식", 7000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=23296143-1"),
                        new MockMenuPick("김치찌개", 16000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=23296143-2"),
                        new MockMenuPick("감자탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=23296143-3")
                        )
                ),
                Map.entry(
                        "1371384450",
                        List.of(
                        new MockMenuPick("탕수육", 15000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=1371384450-1"),
                        new MockMenuPick("양꼬치", 9000, "https://source.unsplash.com/320x240/?chinese-food,%EC%96%91%EA%BC%AC%EC%B9%98&sig=1371384450-2"),
                        new MockMenuPick("짜장면", 22000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%9C%EC%9E%A5%EB%A9%B4&sig=1371384450-3")
                        )
                ),
                Map.entry(
                        "1823707163",
                        List.of(
                        new MockMenuPick("불고기정식", 16000, "https://source.unsplash.com/320x240/?korean-food,%EB%B6%88%EA%B3%A0%EA%B8%B0%EC%A0%95%EC%8B%9D&sig=1823707163-1"),
                        new MockMenuPick("비빔밥", 7000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=1823707163-2"),
                        new MockMenuPick("제육볶음", 11000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=1823707163-3")
                        )
                ),
                Map.entry(
                        "17893699",
                        List.of(
                        new MockMenuPick("돼지불백", 22000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=17893699-1"),
                        new MockMenuPick("제육볶음", 9000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=17893699-2"),
                        new MockMenuPick("수제비", 15000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=17893699-3")
                        )
                ),
                Map.entry(
                        "2050246779",
                        List.of(
                        new MockMenuPick("제육볶음", 15000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=2050246779-1"),
                        new MockMenuPick("김치찌개", 22000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=2050246779-2"),
                        new MockMenuPick("감자탕", 9000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=2050246779-3")
                        )
                ),
                Map.entry(
                        "7988170",
                        List.of(
                        new MockMenuPick("군만두", 16000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=7988170-1"),
                        new MockMenuPick("짜장면", 10000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%9C%EC%9E%A5%EB%A9%B4&sig=7988170-2"),
                        new MockMenuPick("마라샹궈", 24000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=7988170-3")
                        )
                ),
                Map.entry(
                        "10644213",
                        List.of(
                        new MockMenuPick("마라샹궈", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EB%A7%88%EB%9D%BC%EC%83%B9%EA%B6%88&sig=10644213-1"),
                        new MockMenuPick("볶음밥", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EB%B3%B6%EC%9D%8C%EB%B0%A5&sig=10644213-2"),
                        new MockMenuPick("탕수육", 12000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=10644213-3")
                        )
                ),
                Map.entry(
                        "731249424",
                        List.of(
                        new MockMenuPick("김치찌개", 20000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=731249424-1"),
                        new MockMenuPick("수제비", 12000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=731249424-2"),
                        new MockMenuPick("갈비탕", 30000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=731249424-3")
                        )
                ),
                Map.entry(
                        "1702681001",
                        List.of(
                        new MockMenuPick("짜장면", 12000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%9C%EC%9E%A5%EB%A9%B4&sig=1702681001-1"),
                        new MockMenuPick("탕수육", 8000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=1702681001-2"),
                        new MockMenuPick("고추잡채", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B3%A0%EC%B6%94%EC%9E%A1%EC%B1%84&sig=1702681001-3")
                        )
                ),
                Map.entry(
                        "1649096796",
                        List.of(
                        new MockMenuPick("수제비", 16000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=1649096796-1"),
                        new MockMenuPick("제육볶음", 11000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=1649096796-2"),
                        new MockMenuPick("돼지불백", 7000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=1649096796-3")
                        )
                ),
                Map.entry(
                        "15623027",
                        List.of(
                        new MockMenuPick("탕수육", 12000, "https://source.unsplash.com/320x240/?chinese-food,%ED%83%95%EC%88%98%EC%9C%A1&sig=15623027-1"),
                        new MockMenuPick("짬뽕", 18000, "https://source.unsplash.com/320x240/?chinese-food,%EC%A7%AC%EB%BD%95&sig=15623027-2"),
                        new MockMenuPick("군만두", 8000, "https://source.unsplash.com/320x240/?chinese-food,%EA%B5%B0%EB%A7%8C%EB%91%90&sig=15623027-3")
                        )
                ),
                Map.entry(
                        "25401969",
                        List.of(
                        new MockMenuPick("비빔밥", 7000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=25401969-1"),
                        new MockMenuPick("수제비", 11000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=25401969-2"),
                        new MockMenuPick("제육볶음", 16000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=25401969-3")
                        )
                ),
                Map.entry(
                        "402903717",
                        List.of(
                        new MockMenuPick("제육볶음", 22000, "https://source.unsplash.com/320x240/?korean-food,%EC%A0%9C%EC%9C%A1%EB%B3%B6%EC%9D%8C&sig=402903717-1"),
                        new MockMenuPick("돼지불백", 9000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=402903717-2"),
                        new MockMenuPick("된장찌개", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%90%9C%EC%9E%A5%EC%B0%8C%EA%B0%9C&sig=402903717-3")
                        )
                ),
                Map.entry(
                        "1016028633",
                        List.of(
                        new MockMenuPick("김치찌개", 9000, "https://source.unsplash.com/320x240/?korean-food,%EA%B9%80%EC%B9%98%EC%B0%8C%EA%B0%9C&sig=1016028633-1"),
                        new MockMenuPick("비빔밥", 15000, "https://source.unsplash.com/320x240/?korean-food,%EB%B9%84%EB%B9%94%EB%B0%A5&sig=1016028633-2"),
                        new MockMenuPick("돼지불백", 22000, "https://source.unsplash.com/320x240/?korean-food,%EB%8F%BC%EC%A7%80%EB%B6%88%EB%B0%B1&sig=1016028633-3")
                        )
                ),
                Map.entry(
                        "11744410",
                        List.of(
                        new MockMenuPick("수제비", 16000, "https://source.unsplash.com/320x240/?korean-food,%EC%88%98%EC%A0%9C%EB%B9%84&sig=11744410-1"),
                        new MockMenuPick("갈비탕", 11000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%88%EB%B9%84%ED%83%95&sig=11744410-2"),
                        new MockMenuPick("설렁탕", 7000, "https://source.unsplash.com/320x240/?korean-food,%EC%84%A4%EB%A0%81%ED%83%95&sig=11744410-3")
                        )
                ),
                Map.entry(
                        "843250339",
                        List.of(
                        new MockMenuPick("커피 세트", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%BB%A4%ED%94%BC%20%EC%84%B8%ED%8A%B8&sig=843250339-1"),
                        new MockMenuPick("떡볶이", 18000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=843250339-2"),
                        new MockMenuPick("시그니처 세트", 8000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=843250339-3")
                        )
                ),
                Map.entry(
                        "389501703",
                        List.of(
                        new MockMenuPick("버거 세트", 20000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B2%84%EA%B1%B0%20%EC%84%B8%ED%8A%B8&sig=389501703-1"),
                        new MockMenuPick("브런치 플레이트", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B8%8C%EB%9F%B0%EC%B9%98%20%ED%94%8C%EB%A0%88%EC%9D%B4%ED%8A%B8&sig=389501703-2"),
                        new MockMenuPick("오늘의 메뉴", 30000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=389501703-3")
                        )
                ),
                Map.entry(
                        "1328344498",
                        List.of(
                        new MockMenuPick("떡볶이", 15000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=1328344498-1"),
                        new MockMenuPick("대표 메뉴", 22000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%8C%80%ED%91%9C%20%EB%A9%94%EB%89%B4&sig=1328344498-2"),
                        new MockMenuPick("디저트 세트", 9000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%94%94%EC%A0%80%ED%8A%B8%20%EC%84%B8%ED%8A%B8&sig=1328344498-3")
                        )
                ),
                Map.entry(
                        "192029925",
                        List.of(
                        new MockMenuPick("치킨 세트", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%B9%98%ED%82%A8%20%EC%84%B8%ED%8A%B8&sig=192029925-1"),
                        new MockMenuPick("브런치 플레이트", 8000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B8%8C%EB%9F%B0%EC%B9%98%20%ED%94%8C%EB%A0%88%EC%9D%B4%ED%8A%B8&sig=192029925-2"),
                        new MockMenuPick("오늘의 메뉴", 18000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=192029925-3")
                        )
                ),
                Map.entry(
                        "12768652",
                        List.of(
                        new MockMenuPick("치킨 세트", 10000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%B9%98%ED%82%A8%20%EC%84%B8%ED%8A%B8&sig=12768652-1"),
                        new MockMenuPick("커피 세트", 16000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%BB%A4%ED%94%BC%20%EC%84%B8%ED%8A%B8&sig=12768652-2"),
                        new MockMenuPick("오늘의 메뉴", 24000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=12768652-3")
                        )
                ),
                Map.entry(
                        "1300657734",
                        List.of(
                        new MockMenuPick("오늘의 메뉴", 9000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=1300657734-1"),
                        new MockMenuPick("대표 메뉴", 15000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%8C%80%ED%91%9C%20%EB%A9%94%EB%89%B4&sig=1300657734-2"),
                        new MockMenuPick("버거 세트", 22000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B2%84%EA%B1%B0%20%EC%84%B8%ED%8A%B8&sig=1300657734-3")
                        )
                ),
                Map.entry(
                        "2004094531",
                        List.of(
                        new MockMenuPick("오늘의 메뉴", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=2004094531-1"),
                        new MockMenuPick("디저트 세트", 8000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%94%94%EC%A0%80%ED%8A%B8%20%EC%84%B8%ED%8A%B8&sig=2004094531-2"),
                        new MockMenuPick("떡볶이", 18000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=2004094531-3")
                        )
                ),
                Map.entry(
                        "27778238",
                        List.of(
                        new MockMenuPick("디저트 세트", 30000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%94%94%EC%A0%80%ED%8A%B8%20%EC%84%B8%ED%8A%B8&sig=27778238-1"),
                        new MockMenuPick("떡볶이", 20000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=27778238-2"),
                        new MockMenuPick("샌드위치", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%83%8C%EB%93%9C%EC%9C%84%EC%B9%98&sig=27778238-3")
                        )
                ),
                Map.entry(
                        "1605018985",
                        List.of(
                        new MockMenuPick("오늘의 메뉴", 15000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=1605018985-1"),
                        new MockMenuPick("커피 세트", 9000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%BB%A4%ED%94%BC%20%EC%84%B8%ED%8A%B8&sig=1605018985-2"),
                        new MockMenuPick("시그니처 세트", 22000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=1605018985-3")
                        )
                ),
                Map.entry(
                        "182767122",
                        List.of(
                        new MockMenuPick("떡볶이", 22000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%96%A1%EB%B3%B6%EC%9D%B4&sig=182767122-1"),
                        new MockMenuPick("시그니처 세트", 15000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=182767122-2"),
                        new MockMenuPick("오늘의 메뉴", 9000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=182767122-3")
                        )
                ),
                Map.entry(
                        "1286204634",
                        List.of(
                        new MockMenuPick("시그니처 세트", 30000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%B2%98%20%EC%84%B8%ED%8A%B8&sig=1286204634-1"),
                        new MockMenuPick("오늘의 메뉴", 12000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%98%A4%EB%8A%98%EC%9D%98%20%EB%A9%94%EB%89%B4&sig=1286204634-2"),
                        new MockMenuPick("버거 세트", 20000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B2%84%EA%B1%B0%20%EC%84%B8%ED%8A%B8&sig=1286204634-3")
                        )
                ),
                Map.entry(
                        "758126508",
                        List.of(
                        new MockMenuPick("버거 세트", 24000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%B2%84%EA%B1%B0%20%EC%84%B8%ED%8A%B8&sig=758126508-1"),
                        new MockMenuPick("대표 메뉴", 10000, "https://source.unsplash.com/320x240/?restaurant-menu,%EB%8C%80%ED%91%9C%20%EB%A9%94%EB%89%B4&sig=758126508-2"),
                        new MockMenuPick("커피 세트", 16000, "https://source.unsplash.com/320x240/?restaurant-menu,%EC%BB%A4%ED%94%BC%20%EC%84%B8%ED%8A%B8&sig=758126508-3")
                        )
                )
    );

    private MockMenuPickData() {
    }

    public static List<MockMenuPick> findByKakaoPlaceId(String kakaoPlaceId) {
        return MENUS_BY_KAKAO_PLACE_ID.getOrDefault(kakaoPlaceId, List.of());
    }

    public static String findRestaurantNameByKakaoPlaceId(String kakaoPlaceId) {
        return RESTAURANT_NAMES_BY_KAKAO_PLACE_ID.get(kakaoPlaceId);
    }
}
