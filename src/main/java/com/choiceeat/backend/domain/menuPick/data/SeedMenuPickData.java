package com.choiceeat.backend.domain.menuPick.data;

import java.util.List;
import java.util.Map;

public class SeedMenuPickData {

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

    private static final Map<String, List<SeedMenuPick>> MENUS_BY_KAKAO_PLACE_ID = Map.ofEntries(
            Map.entry(
                    "27226419",
                    List.of(
                            new SeedMenuPick("물냉면", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTA5MTZfMTcw%2FMDAxNzU3OTk1Njg5MjU4.HBv0KDopQjskHHpu7a3jQKWnZONf7vUc_psNMXF1mDYg._ezyI3QJov7pDmsbknzyzeMFoULG_HB7JlbSNB_vNLYg.JPEG%2FSE-54d8b690-95ed-4c8d-8f99-3a3a1263cad7.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("비빔냉면", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTA4MjFfMzIg%2FMDAxNzU1NzUwNTk5NzI2.OJorhI1qcLMKcVGzBmc0LvOhWIrN5Nk9Ls7DbsxgpF0g.ttevjfB3yLMCxCEXvqVyl136uNdQ9M-ZW_vuLYb3gF0g.JPEG%2FSE-3D9FCEB5-E565-4353-918E-ABB1FB35FBC0.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("오색만두", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fed1ab05877df23f45e682da6a2affbaad1665965464c3a8c562fb496c0fcc98f")
                    )
            ),
            Map.entry(
                    "8218085",
                    List.of(
                            new SeedMenuPick("메밀전", 12000, "https://img1.kakaocdn.net/cthumb/local/C544x408.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F108628fdb4cce928d57b2c2fa4409c815c4e6464%3Foriginal"),
                            new SeedMenuPick("들깨메밀수제비", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F2a80adcbf6fdcd002ab9c948223eb1b0d8494cbc%3Foriginal"),
                            new SeedMenuPick("성북동 누룽지백숙", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F5099b0446238d31847a1bd9d16da63d53a0e48b8%3Foriginal")
                    )
            ),
            Map.entry(
                    "1755515956",
                    List.of(
                            new SeedMenuPick("전통 감자탕", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F7F7FDB9EF5F34730B5555D0ECA80A605"),
                            new SeedMenuPick("시래기 감자탕", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F5D6518A93F7049698B741B1388C04C0F"),
                            new SeedMenuPick("묵은지 감자탕", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2FAC01EC06A13E406FBA88EC33023A969D")
                    )
            ),
            Map.entry(
                    "23300753",
                    List.of(
                            new SeedMenuPick("돼지불백", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTA3MTVfNzUg%2FMDAxNzUyNTg2NjYyMTMy.UPwmrUtNT5WOqSaH3IaJOM1v6gHHT1r2ddafyrPcI68g.vhPjiRKVF7hHG0iCVgUd6gVKUrT7SjSye1UcpUpWV6wg.JPEG%2F94999469-356B-4944-8689-78F2BD08401A_1_105_c.jpeg%3Ftype%3Dw773"),
                            new SeedMenuPick("부대찌개", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FTHK7F%2FbtsQmkIuMjt%2F37LnhPxkCqacTErnR6Kcp0%2Fimg.jpg"),
                            new SeedMenuPick("낙지볶음", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F408a2863be9a0e7f58aa0c4beb3958619e777a3a%3Foriginal")
                    )
            ),
            Map.entry(
                    "17569573",
                    List.of(
                            new SeedMenuPick("수청", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F74635c4845d47d6ff17600a40e5882da9407c66d%3Foriginal"),
                            new SeedMenuPick("산청", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTExMjhfMzAw%2FMDAxNzY0MzE0MjE4MTg1.q47rJHjU4ZLkNxyGs4ZEXONqOJrWV6Ue6x7xCg4ypIAg.6MraHo_7gb0eSam3guxcDCH1QpGNUezA2NrxNiJaTnEg.PNG%2F1764314183470-019ac951-c270-70e4-91f9-cd55bbc84633.png%3Ftype%3Dw773"),
                            new SeedMenuPick("인청", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F967f50ceaaa623cad37add8217a799ab94a0f75a%3Foriginal")
                    )
            ),
            Map.entry(
                    "7948105",
                    List.of(
                            new SeedMenuPick("고기만두", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fd9024d024422c297846206c56040c9f1e24633b0%3Foriginal"),
                            new SeedMenuPick("칼만둣국", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA0MjJfNyAg%2FMDAxNzc2ODY1Nzk4MDQ2.z7B5GuKPxg4VrIC0XDaE83tyYu5qVJ6ZVBoZ1pvzQIog.h0pfcuoWQthIBg3VZoAkWgtrS52JuZz4eQCjBEzo2QYg.JPEG%2FIMG_7709.jpeg%3Ftype%3Dw773"),
                            new SeedMenuPick("칼국수", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTEwMTNfMjQx%2FMDAxNzYwMzQzMDYyNzkw.A1mX41SYSfOEULc0a8QkCidCzEQGT1pSrIoufLGaa2og.Wn2sSEpM6zTISMSynYFbv5VEt9AVcy-kahpyw1A3wtEg.JPEG%2FSE-b5e6bec6-aa36-453e-b468-fa146b0de984.jpg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "21233686",
                    List.of(
                            new SeedMenuPick("설렁탕", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fda8463df0365bf112cb5d3e0a0afe78b98764f8c%3Foriginal"),
                            new SeedMenuPick("수육", 30000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA0MDlfMTgw%2FMDAxNzc1NzAzMDE3MzE4.B-U2DXX41VMJjYpTfFi1QcdJSgz2ffkHcPusws0MPasg.cNnmTZ5wPL2-m6A_PC1AIaz33gnlZ6pRUNFSQo4SmY0g.JPEG%2F5.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("접시수육", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNDA4MjBfODMg%2FMDAxNzI0MTI0OTE0OTkw.MIw4nb1AM2B57VOSXjH7l2IdjGlpk6ov5O8QUBDbIXAg.h2Ivh21KDNOThR7VVD6xIZlHEd6FvOR8uG0HkrO88TEg.JPEG%2F1724124910391.jpg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "21526500",
                    List.of(
                            new SeedMenuPick("돼지갈비", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F17E5AD8A7DBE41708BBED20764A8268F"),
                            new SeedMenuPick("비빔냉면", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2FB8148933764548F6AB826B1F821FEE6F"),
                            new SeedMenuPick("물냉면", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F793433D5145F489594F062F37CE70806")
                    )
            ),
            Map.entry(
                    "1925267112",
                    List.of(
                            new SeedMenuPick("돼지김치곱장대창구이", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F416D7B610B30451DB80B271CFFD2445B"),
                            new SeedMenuPick("한우곱창모듬구이", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F4D8EE751033A42A984DCB1B93009C7E1"),
                            new SeedMenuPick("치즈명란감자전", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F0628e3a7d4b4ad36b3115e2095d6fef940cca4c0%3Foriginal")
                    )
            ),
            Map.entry(
                    "24353265",
                    List.of(
                            new SeedMenuPick("차돌박이짬뽕", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F801ff4d1767a68e4ee196d3148a103231ed48fe5%3Foriginal"),
                            new SeedMenuPick("유린기", 26000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fcc97472a9f41f85e79036b5fc7bac5917fc934bf%3Foriginal"),
                            new SeedMenuPick("탕수육", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fe6a54747870461b141e5fff1d31e9bf495463499%3Foriginal")
                    )
            ),
            Map.entry(
                    "25451287",
                    List.of(
                            new SeedMenuPick("애정마라탕", 18500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F59a8ae9ba57ada9254888c96bd6f2088bc813928%3Foriginal"),
                            new SeedMenuPick("애정마라샹궈", 18500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F07ff0b33fc7838d99f024017124b2b8296a204c0%3Foriginal"),
                            new SeedMenuPick("계란볶음밥", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAyMDlfNDEg%2FMDAxNzcwNjA0NzAyOTI1.QZ8fCI9WNxyNDttQABn3m5i1NPW3xeODaY7e4LvTPyMg.RZHwIDC3ecftPAncPzkmawYRAYNWssRtooXmIgUJnW4g.JPEG%2Foutput%25EF%25BC%25BF1955954991.jpg%3Ftype%3Dw773")
                    )
            ),
            Map.entry(
                    "557188800",
                    List.of(
                            new SeedMenuPick("탕수육", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fe37e9e67baffd30dcb636c7507dbde122c9168a0%3Foriginal"),
                            new SeedMenuPick("짬뽕", 8500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F7f425cc613c613fc2adb4ce5ade7d6ee7b4821cd%3Foriginal"),
                            new SeedMenuPick("짜장면", 7000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAyMDNfMjI4%2FMDAxNzcwMTA5MjIyMjI3.W_A_WZP5B0kgZ-TndfJC3nDFEsQ7_FjGqsOTsgekQ_8g.5HvY5Jliah6QWUrUF1VYTe8IPF6AlveaTY3i87QV6o8g.JPEG%2Foutput%25EF%25BC%25BF2797811935.jpg%3Ftype%3Dw773")
                    )
            ),
            Map.entry(
                    "697084504",
                    List.of(
                            new SeedMenuPick("마라 곱창탕면", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F1dcfaa1165bb92ed47a9e82ffbb6b1507267d453%3Foriginal"),
                            new SeedMenuPick("유자 크림새우", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F0cc790ddaf07f3cb6d658c3536670582762d8345%3Foriginal"),
                            new SeedMenuPick("황도꿔바로우", 10500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F9f4c5ee84b4132ce810e35e0e4ba400b392c2e27%3Foriginal")
                    )
            ),
            Map.entry(
                    "21401923",
                    List.of(
                            new SeedMenuPick("호남볶음밥", 8000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff0a36c9b225926e1046ab4a3f816040224cb9a7e%3Foriginal"),
                            new SeedMenuPick("꿔보우러우", 15800, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F0a33a7c147c3e7b6a358f24e28d9a943f45d50cc%3Foriginal"),
                            new SeedMenuPick("가지찜", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ffeff8d138f11984e4874e9fdd45d269013904ee0%3Foriginal")
                    )
            ),
            Map.entry(
                    "1841813748",
                    List.of(
                            new SeedMenuPick("꿔바로우", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F1ea6fc0eb59d6f0d43fe194b6e3d2070a3cf6979%3Foriginal"),
                            new SeedMenuPick("양꼬치 무한리필", 24000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F58f3eb1ab2e1efbe98a47ffaa756398a0bade363%3Foriginal"),
                            new SeedMenuPick("훠궈 무한리필", 21900, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F268de0b809fdc4d05476304d3693a1790573af9f%3Foriginal")
                    )
            ),
            Map.entry(
                    "2108202354",
                    List.of(
                            new SeedMenuPick("직화짜장면", 10000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F887822e36f6b59a923b56a04036a2bad4a337814%3Foriginal"),
                            new SeedMenuPick("통낙지짬뽕", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ffa3b38df7ac469b02c3d9c03f7e8dc30d425641b4f6922880bf260688b811f30"),
                            new SeedMenuPick("탕수육", 21900, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F7025230858479eb0fbe9dcaa05fb9ae338d3fa43%3Foriginal")
                    )
            ),
            Map.entry(
                    "688654430",
                    List.of(
                            new SeedMenuPick("깐풍새우", 23000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fe751fbfac813d3e64177d616ed4828236d633873e7bf4cc4faddf900e8dcde3f"),
                            new SeedMenuPick("칠리중새우", 23000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F1bf60af58668bddfafb5bfadce88ca322b1affe0%3Foriginal"),
                            new SeedMenuPick("차돌짬뽕", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ffc682a9695167a94f64c7bc77894c0c564952622%3Foriginal")
                    )
            ),
            Map.entry(
                    "721426198",
                    List.of(
                            new SeedMenuPick("해물볶음짜장", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F2dab42053f6517025076cecfd9191a78e74965d9%3Foriginal"),
                            new SeedMenuPick("군만두", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F2883bf846ee4634ac2ebabf281718bb3045362b2%3Foriginal"),
                            new SeedMenuPick("유린탕수육", 22500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F3d1932aa9a1c1e61bf502ff15857cfd19ca19cd4%3Foriginal")
                    )
            ),
            Map.entry(
                    "7960698",
                    List.of(
                            new SeedMenuPick("물만두", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAzMTlfMTg0%2FMDAxNzczODkzOTk3NTYw.pioh1apcOeJ-msSsitx2PpPr4mUw9kW7eYoW4EKvaMog.9eVZQOjUacoc9Rea9SaXfMkParIikMsmwm8jGqr5clcg.JPEG%2FKakaoTalk_20260319_113417357_14.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("볶음밥", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNDExMDlfODgg%2FMDAxNzMxMTUzODY1NzU5.8jp6vJbu4TKDhpV0rZsWEhw8CDknE9eHi7XR9O2w0CUg.7v26MmTC83XgwX3lx75tqDI3hLVS3yxNaLo6WfE_HTIg.JPEG%2F20241105%25EF%25BC%25BF132311.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("짜장면", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyMzExMzBfODUg%2FMDAxNzAxMzUxODg3Nzk1.Jylo4aQLKUHZs4rGnzb1OXSY5TuFxWq4mzIhHWihETMg.dQsynkRwqPctPLMCtP0uos9aVs1wHXT5NujC0YEDgL4g.JPEG.agant5548%2FKakaoTalk_20231129_182531359.jpg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "8238823",
                    List.of(
                            new SeedMenuPick("등심돈까스", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fb642ea0af53fcfefe842543acad1f14d37018912%3Foriginal"),
                            new SeedMenuPick("치킨까스", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fc346fe300557deea3f0163145ce0413970f336ec%3Foriginal"),
                            new SeedMenuPick("금왕정식", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fe443bbf8f5430ac70aed65fa893ffd284dba309b%3Foriginal")
                    )
            ),
            Map.entry(
                    "7937741",
                    List.of(
                            new SeedMenuPick("우동 돈까스 세트", 13500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTA4MjRfOTQg%2FMDAxNzU1OTY3NTcyMzk2.drHFcmg6kRDdPG3VAVoSTRwFbhG9q18qXJgsy0tHrKUg.L1VrnD7R7QDtbZajBsXR74T1otO4jBE4_AtL1DwPNxQg.JPEG%2FIMG%25EF%25BC%25BF3935.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("왕돈까스", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fbf9b41097732bbb90a5f37da0f7723b855257928%3Foriginal"),
                            new SeedMenuPick("냉모밀 돈까스 세트", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ffbc2800a691a57dcaa23a866abc3e10daa5e3ea0%3Foriginal")
                    )
            ),
            Map.entry(
                    "1271420842",
                    List.of(
                            new SeedMenuPick("사시미 모리이와세", 35000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F0989ef555dbacab51b12b3f29016b54bb76e6ff6%3Foriginal"),
                            new SeedMenuPick("오늘의 초밥 12ps", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA1MTFfNTQg%2FMDAxNzc4NDk3Mzc2ODYx.c5S6OQ5IzLVp4UNaHpGF9Z51Pzoe8wlbk_HNEif95rog.kk9rD0w0WPM2J2dmHhkPTbrEtMuk4uUAcWmiDUkbmOQg.JPEG%2FIMG%25EF%25BC%25BF6560.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("크림짬뽕우동", 19000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff4790da20b4c92ffcf515b5899e34d37d7d1d753%3Foriginal")
                    )
            ),
            Map.entry(
                    "1746912410",
                    List.of(
                            new SeedMenuPick("왕돈까스", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F30f65de671dc2659f6d396283bce7547b6825063%3Foriginal"),
                            new SeedMenuPick("후라이드치킨", 16900, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FHnQ18%2FdJMcaeFZaLS%2F3FPrHgeM2kSfKEJBPnyMqK%2Fimg.jpg"),
                            new SeedMenuPick("온달정식", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FctLl1V%2FdJMcajUPuJR%2FEDNxSKcNfJAmqINK8TvTNk%2Fimg.jpg")
                    )
            ),
            Map.entry(
                    "1540691570",
                    List.of(
                            new SeedMenuPick("사케동", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA1MTdfNDgg%2FMDAxNzc5MDI4NDY5MjM1.-P8rTDlGGVGHky1687OCVTGGhUYOPYmUZJ9ba393w0og.P5DeESXmpfdznjD5s-chEN97er9t2Z2SNLewIxM7bvcg.PNG%2Fimage.png%3Ftype%3Dw966"),
                            new SeedMenuPick("데미그라스 돈까스", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fac9359c3be3adb37cf16489c8ba8595c395b03b5%3Foriginal"),
                            new SeedMenuPick("명란크림우동", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F22a73655eda5f75c5be5565e5366e5a37315db88%3Foriginal")
                    )
            ),
            Map.entry(
                    "1992081643",
                    List.of(
                            new SeedMenuPick("커플세트", 26000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F6196da44c248a2e1e2877c1143fddefd0b7da577%3Foriginal"),
                            new SeedMenuPick("스페셜초밥(10ps)", 19000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F3108F63B46044F70B5764163DAE38F89"),
                            new SeedMenuPick("오마카세초밥", 27000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F96d0f7826c80be2a18269e1c2db3d12cbe6af86b%3Foriginal")
                    )
            ),
            Map.entry(
                    "908523329",
                    List.of(
                            new SeedMenuPick("특선초밥", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA1MDZfMjM5%2FMDAxNzc4MDU2NTIyNTQ3.F8_edNzyKcWSBMIInZbEfOGGx3MB6x6N9iqLx-mdRA0g.QcEum5g1QsHhMb1dbCkmHsEGxHvSIXIFhH2TCnW-Y1Ag.JPEG%2FSE-fc2684b6-6565-44fd-85fc-b1d2115f5766.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("모듬사시미", 25000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAyMTVfMjEy%2FMDAxNzcxMTYxODgyNzM0.J6tqbHyJoGUBmCGjnHS8uPJ-qzpq2MdRBbo2t0mGBhsg.5eeTuOhFwHYG-Fws6E86Ys7fZm4eciVoO7Chogf9-M0g.JPEG%2FIMG%25EF%25BC%25BF8779.JPG%3Ftype%3Dw773"),
                            new SeedMenuPick("연어롤", 17000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTEwMTRfNDAg%2FMDAxNzYwNDQ1MjUxMzc2.Gf5XXTkOdnhSO2WSJmRK6qO1PyfTwGwiZy4Zk4vNXpcg.XNPbWcKGukDTZUjDmhytlm4KVbT02PctCK7xsCs5QgIg.JPEG%2FIMG_7329.jpg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "1196036428",
                    List.of(
                            new SeedMenuPick("모둠돈까스정식", 15500, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F6a70f23deaf731b0cdc4df33666db95a784b6844%3Foriginal"),
                            new SeedMenuPick("등심돈까스", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F443f08a27a0b698ea77ce1eaec2e6454d4d3ccf8%3Foriginal"),
                            new SeedMenuPick("치즈돈까스정식", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTAxMDFfMTA3%2FMDAxNzM1NzQwODg4MzQ4.XMWe5pIwbh-Gbc9tM5Z-f_nZTIBaMjbwfCJKOFeChnQg.G3YuvKft0_C_iFAPBrlCAyyniVLs8a9t08IX_6sR5-cg.JPEG%2FSE-538155fb-c07b-11ef-97ed-3f768be2e6d8.jpg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "15917933",
                    List.of(
                            new SeedMenuPick("돈가스", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Ft1.daumcdn.net%2Flocal%2Freview_placeapp%2Fbtqs0n8UqU7_X8QUViPEOAhzh1edjgeQ50_img.jpg"),
                            new SeedMenuPick("생선까스", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F953c1b6060495e84b283b4807540cc75ac1b4c4f%3Foriginal"),
                            new SeedMenuPick("오박사정식", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ffc67f901c94945ddebff2019a4733f9f3aa02548%3Foriginal")
                    )
            ),
            Map.entry(
                    "456860336",
                    List.of(
                            new SeedMenuPick("특선사시미", 28000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F708EFCE3A2094C70A09C90340D48B3BD"),
                            new SeedMenuPick("카이센동", 25000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTExMDFfMTMz%2FMDAxNzYxOTk0NDcxNjQz.pSrYkFiO1wvN4QI52irua0dc0tVaEN7WagAjSy7OzJ0g.bP-PfbeEMVAFfe3PMfbhWdRwZPwK0eDE27iDjj-F_YUg.JPEG%2FKakaoTalk_20251101_195217389_19.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("특서시초밥(12p)", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F4d9a60888d6648c18d2fac5323661b51c3e7eb28%3Foriginal")
                    )
            ),
            Map.entry(
                    "2040703324",
                    List.of(
                            new SeedMenuPick("오야꼬동", 9000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fcf4264546209c3d956a350ebd3b7f0374c99c69b%3Foriginal"),
                            new SeedMenuPick("특별카레", 9000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fd3158b5893e8b896413bac6c42a0ab90ea72b3db%3Foriginal"),
                            new SeedMenuPick("규동", 9000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F4f680f77cdbb7327dd75cdb4ffd624d2e4bd340a%3Foriginal")
                    )
            ),
            Map.entry(
                    "485306026",
                    List.of(
                            new SeedMenuPick("삼합", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F8d6e804b72ac18f6c99cdc89cbdda9f6acf295b5%3Foriginal"),
                            new SeedMenuPick("까르보나라", 19000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F9ee9ac36e83bf3d699b08f701529b14cc96adeb6%3Foriginal"),
                            new SeedMenuPick("뇨끼", 21000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F2033f4e449f3acecb24c7a80c38348992e0568aa%3Foriginal")
                    )
            ),
            Map.entry(
                    "452915279",
                    List.of(
                            new SeedMenuPick("해를품은파스타", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2FDD6E1E31AF914D57AAB3D16420965F10"),
                            new SeedMenuPick("명란오일파스타", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2FC9E157D2092C4F409411A5E97E44109D"),
                            new SeedMenuPick("반반피자(루꼴라&포테이토)", 21000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA1MDZfMTE3%2FMDAxNzc4MDQ3MzUwOTMx.8mOplZAQx-yya1K7FLbyc8o7iu_eZlK94jLoRdWIbI8g.tmWwKJM1GrxUF4PkgVE5bQ8KXmZvwZURVb2eIs5vl3Qg.JPEG%2FIMG%25EF%25BC%25BF2008.JPG%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "230989806",
                    List.of(
                            new SeedMenuPick("라자냐", 26000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F865233C81EC848E69E959CBF35974AA9"),
                            new SeedMenuPick("갈릭 모짜렐라 피자", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNDExMDlfMjIx%2FMDAxNzMxMTA5NTEzOTcx.3SbI1SqlhYboMU4QXXYypdUIrMhQ8Ex8r74kSIGv2HMg.Q-ORRONN5PTmQT-CHpCKjqW8d-90GnuOX57e1RDIcWYg.JPEG%2FIMG_0270.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("리코타 샐러드", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2FEBDD78E3E8AD445A99E14E3E1D29D8A7")
                    )
            ),
            Map.entry(
                    "1177828422",
                    List.of(
                            new SeedMenuPick("해산물 빠에야", 26000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F0c9131d063c37aead078bd1ea37a191755f94fd5%3Foriginal"),
                            new SeedMenuPick("고사리 오일 파스타", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F351F49FE1CC5434BA6E0392BB9370EFB"),
                            new SeedMenuPick("트러플 크림 뇨끼", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F768092d92528ce79bef8f84f1aacfd8dd8b689e2%3Foriginal")
                    )
            ),
            Map.entry(
                    "1039522002",
                    List.of(
                            new SeedMenuPick("오일파스타", 25000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAzMjdfMjIy%2FMDAxNzc0NTgxMTI4OTEz.02CHq3zv6vvZLcAYBWBFrhhXtnLhBds5AiWN1s0nYQkg.W8t-Fvd588UmuRC_Cp-p-LCSVT8hByUVcBT3kPqXtbwg.JPEG%2F20260326%25EF%25BC%25BF191828.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("채끝 스테이크", 35000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff729340b5892a765eebade80e947cee6a601c605%3Foriginal"),
                            new SeedMenuPick("포르치니 리조또", 25000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTA4MjVfNjMg%2FMDAxNzU2MTEwOTExMDM3.LBSyIdCbEJmk9ZDKXJYn123zpINuMG4ZmP8Y7xpce20g.Ri9WWHlX-7CBVD5OLaDCNsW0g84Q-Y45aEtuJog6piIg.JPEG%2Foutput%25EF%25BC%25BF2068814063.jpg%3Ftype%3Dw773")
                    )
            ),
            Map.entry(
                    "26546805",
                    List.of(
                            new SeedMenuPick("치즈버거", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fb357910163d27cfa0795348ed60fe221d726574f%3Foriginal"),
                            new SeedMenuPick("쉬림프 치즈버거", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Ft1.daumcdn.net%2Flocal%2Freview_placeapp%2FbtqpdfHFoIp_iQRk7fH0DVFtakWOSrKQZk_img.jpg"),
                            new SeedMenuPick("비프 치즈버거", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Ft1.daumcdn.net%2Flocal%2Freview_placeapp%2Fbtqph8fjL2M_Ko4kqQQzjzKgK4YKLR3p70_img.jpg")
                    )
            ),
            Map.entry(
                    "573428715",
                    List.of(
                            new SeedMenuPick("남편피자", 21000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F00a75c1de12a19b8f3687e0707b68c60b4ee2f64%3Foriginal"),
                            new SeedMenuPick("아내피자", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F3c6c478cd2cb08d048c1b4de644c1261f8e4c4c4%3Foriginal"),
                            new SeedMenuPick("풍기피자", 24000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F011d5bb70249cc33294f3a4c4c806d1635dacda8%3Foriginal")
                    )
            ),
            Map.entry(
                    "974275602",
                    List.of(
                            new SeedMenuPick("청양 빠네파스타", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ffbead0ff1fb96cc4fb6208084ab7a51bf92cedfd%3Foriginal"),
                            new SeedMenuPick("스테이크", 35000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fd3b4410d88ecc23365b3a1199ec0fa6434d74032%3Foriginal"),
                            new SeedMenuPick("카프레제", 17000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F887613bb5221c926152bcdde27f47583f03f4530%3Foriginal")
                    )
            ),
            Map.entry(
                    "923778015",
                    List.of(
                            new SeedMenuPick("피쉬 구이 스튜", 32000, "https://img1.kakaocdn.net/cthumb/local/C224x224.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F9287A40BC2EE4E9CADE83695DB28E4D8"),
                            new SeedMenuPick("부채살 스테이크", 25000, "https://img1.kakaocdn.net/cthumb/local/C224x224.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F8AF06F60A8CF41C88ADCA89FAA7A9871"),
                            new SeedMenuPick("참나물 봉골레", 20000, "https://img1.kakaocdn.net/cthumb/local/C224x224.q50/?fname=http%3A%2F%2Ft1.kakaocdn.net%2Fmystore%2F41553B7FC5444F14B17C3C00F868EE0E")
                    )
            ),
            Map.entry(
                    "2114116437",
                    List.of(
                            new SeedMenuPick("머쉬룸 페스토 크림 파스타", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F020c06014f51c3e6d4848e63afa0fb090ea7b92d%3Foriginal"),
                            new SeedMenuPick("머쉬룸 피자", 32000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAzMTlfNDIg%2FMDAxNzczOTAzODA2OTcx.dv-3NM6QYViaq6e4NWJCJAO8Jhhj2iqEgyrcygNZrnAg.eeKdIfjx1Db0tWf07ggwbA9URd_88j8obIC9s6PraBUg.JPEG%2FIMG%25EF%25BC%25BF5925.JPG%3Ftype%3Dw966"),
                            new SeedMenuPick("스테이크", 45000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA1MjRfMTQ3%2FMDAxNzc5NjExOTk1NjI4.tFXprbHL5F38-yIpp00vOAQ8um1DhUdBaq7LY4I577Eg.Jg7bchYesPeykR-WIRVQVTjkFuAKVYn4-t74PXhhmasg.JPEG%2FF3F6FA87-E353-42F5-8F5B-843D0F10B6E3_1_105_c.jpeg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "20944335",
                    List.of(
                            new SeedMenuPick("짜장면", 14000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff2c433c5231c04566f051ffa6bc111af58dd2453%3Foriginal"),
                            new SeedMenuPick("짬뽕", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff7db3c8599a89efe3eb172dd53fe2e61a33538d4%3Foriginal"),
                            new SeedMenuPick("탕수육", 27000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Ft1.daumcdn.net%2Flocal%2Freview_placeapp%2FbtqgfmA8V8h_uS2fWIOQsuAkFV509djvd0_img.jpg")
                    )
            ),
            Map.entry(
                    "8200924",
                    List.of(
                            new SeedMenuPick("국시", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fcd246414aaf18d70baffb89cecd3912e78bb2542%3Foriginal"),
                            new SeedMenuPick("문어", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTEyMDVfOTUg%2FMDAxNzY0OTE3ODI5NjE0.T3oP34AdrMUhZvY39PvF0mOr9n6DkDjhIuNc1DFBAEEg.t7yA37T1gRy2meLYfmjR3zK4o6nwyUj6DCnO9g0WpVQg.JPEG%2F20250503_183413.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("수육", 30000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTEyMDVfMjE3%2FMDAxNzY0OTE3ODcwNjI3.clSxavVFO0uvvS5s7Vj9HVvOxinmCS80o0XI0oGqyZ4g.rwewz5b42TQ55HMkOovJ1a39nL9G-oWEHmkQeZ3uVtsg.JPEG%2F20250503_183121.jpg%3Ftype%3Dw773")
                    )
            ),
            Map.entry(
                    "24873082",
                    List.of(
                            new SeedMenuPick("메밀 물막국수", 13000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fe40d3a712d5135cad5d719a91cf4e8e8717805cf%3Foriginal"),
                            new SeedMenuPick("메밀 비빔막국수", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAyMDFfMTUg%2FMDAxNzY5OTIyOTIwMTI4.NUfxenq-pt7gTgczCNUC206niVrWudjFtvWFSSCLNwUg.v24AWjeL5Uh26DLk3oqhwEkaOFNh-w8kArzfoZfXXAAg.JPEG%2F900%25EF%25BC%25BF20260201%25EF%25BC%25BF123521.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("메밀전병", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F4306a042c8e09bcbd215ced5004dd29410eca77d%3Foriginal")
                    )
            ),
            Map.entry(
                    "8129950",
                    List.of(
                            new SeedMenuPick("메밀 냉칼국수", 11000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Ft1.daumcdn.net%2Flocal%2Freview_placeapp%2FbtquJZTAavb_tPDkglkOdTkV5rQtbAKSTK_img.jpg"),
                            new SeedMenuPick("만두국", 9000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F85ff85ed6ac33c287eb28e8c7dc5424c7cd641d6%3Foriginal"),
                            new SeedMenuPick("만두전골", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAzMDVfODUg%2FMDAxNzcyNjc4MzcwNjgy.dE1UEGWlMXy_Xn9liHVMK0ATxCEOO2Kj6j2OsR5KOmYg.-dXSIzNZIlYv4rgTRFVC7SsWnQyDVsXYp_OpWacjB2Mg.JPEG%2F900%25EF%25BC%25BF1772678085954.jpg%3Ftype%3Dw580")
                    )
            ),
            Map.entry(
                    "579222224",
                    List.of(
                            new SeedMenuPick("꽃등심 불고기 김밥", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAzMTVfMTkx%2FMDAxNzczNTU4NDMwMTI2.t8HCu07M4VHr2iGxPTUJ23xDOJp5oI7kYXfMQYTX1N8g.D0EdU-28YDnObSn98u8_-5oWqZFn5olfufCspYZRuW0g.JPEG%2Foutput%25EF%25BC%25BF3725312554.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("박고지 김밥", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjAzMTVfOTgg%2FMDAxNzczNTU4NDMwNjU5.EVFi6jlIyZ13_AgLVeam7hDfWaOBRxm3zvd3aSuOTSkg.1E1sIOLXBj8SUtT1j_SyxGJ8yYPYkR-3WQL7snNGL6og.JPEG%2Foutput%25EF%25BC%25BF2446187281.jpg%3Ftype%3Dw966"),
                            new SeedMenuPick("전복 톳나물 김밥", 16000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNjA1MDlfNTUg%2FMDAxNzc4MzI4MDc1NDgz.Yq7ZRrnIWFY07dngWAcY5ZIi_8hyC_S9_7cONJMa6DMg.kA-J0OKMjzKufZ6UdWVubAcoVp_qHtaUc3yfvW_CW-wg.JPEG%2FSE-19d6178b-0db1-49e3-85c2-1193126d97b4.jpg%3Ftype%3Dw966")
                    )
            ),
            Map.entry(
                    "1852838507",
                    List.of(
                            new SeedMenuPick("양꼬치", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff2012e0b4e9f1fb3b297d7a4d8a0d6614ff5975e%3Foriginal"),
                            new SeedMenuPick("물만두", 8000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyNTEwMTVfMjc5%2FMDAxNzYwNDgxMDEyNDE4.0k2W2Dg5GKb0iaMrPGCTSSGu4B54Brx-jR2-58mYiVQg.5GIICmWAbHWy4kDCDw7LK-NbPJlCeolaZWMB5enJnM4g.JPEG%2FIMG_7295.jpg%3Ftype%3Dw773"),
                            new SeedMenuPick("탕수육", 17000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F00d724dc7ed622aba7365552f212bdc80ead6800%3Foriginal")
                    )
            ),
            Map.entry(
                    "335111559",
                    List.of(
                            new SeedMenuPick("돼지쫄갈비", 22000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fbdf55da418da5754b9d4382f824061eb21ce13c3%3Foriginal"),
                            new SeedMenuPick("시래기밥", 12000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Ft1.daumcdn.net%2Flocal%2Freview_placeapp%2FbtqsxmQVQFy_WjchLU8Ew5iqOqp5NTV1F1_img.jpg"),
                            new SeedMenuPick("불고기백반", 9000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F776e0e31ea90dcf53f6e1c3e413b6e2cd2c14821%3Foriginal")
                    )
            ),
            Map.entry(
                    "399918679",
                    List.of(
                            new SeedMenuPick("치즈갈비찜", 20000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Ff51e8077880925f0696bc050aa8183e60bb2ce1d%3Foriginal"),
                            new SeedMenuPick("돼지갈비찜", 18000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2Fa6f68095d5b86490677c5d34b828159339e5f6ed%3Foriginal"),
                            new SeedMenuPick("로제갈비찜", 25000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F479ae9092e749b4434833cb0d846e470a4dc5c32%3Foriginal")
                    )
            ),
            Map.entry(
                    "26869649",
                    List.of(
                            new SeedMenuPick("숙성 통삼겹살(180g)", 16000, "https://imagefarm.baemin.com/smartmenuimage/upload/image/2018/27/2018/27/Z0H5MkHfIVelXJKMlJBJtx9fIilRztO3jEfZjT0LH24=.jpg"),
                            new SeedMenuPick("생 김장김치찌개", 17000, "https://imagefarm.baemin.com/smartmenuimage/upload/image/2018/27/2018/27/RvyYmMUNdiFMuMArWk0OWAqqefqAN_zg7GbWLzYCp5OyGkO3rZ8PIDMAUkSJf-aZ.jpg"),
                            new SeedMenuPick("숙성 통목살(180g)", 16000, "https://imagefarm.baemin.com/smartmenuimage/upload/image/2018/27/2018/27/EFXY91k8k9_YZz2Hq25sb8BZJu_tbKISHGsTm8CjNas=.jpg")
                    )
            ),
            Map.entry(
                    "1597826671",
                    List.of(
                            new SeedMenuPick("스파이시포크 반미", 6500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAxMTRfMTc3%2FMDAxNzY4Mzg0NDEyMTU1.xZ_aoRFDxjI0-dTwKu64G8N8dvCeJd6jr3LEvjFuxr0g.JlPmChqdzNS7IIyl_oiSQDyLRnhs9o_dJiedonnXIrQg.JPEG%2F1000117892.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("그릴드치킨 반미", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAxMjhfMjA0%2FMDAxNzY5NTM1OTA4NzMw.RijBmIO8NqfP_6vR3uH8P6vBrN3KGsnZKdMRTaU38MUg.4eaF7JCThvdFcnNeOa9g7jxGJi8dcdZ4U-ywq9Is2k8g.JPEG%2F1000119395.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("콜드컷 반미(햄)", 8000, "https://ldb-phinf.pstatic.net/20200520_30/1589954271038Quw6f_JPEG/%BB%F7%B5%E5%C0%A7%C4%A1%28%B9%DD%B9%CC%29.jpg")
                    )
            ),
            Map.entry(
                    "1008497143",
                    List.of(
                            new SeedMenuPick("참새오마카세(테이블당 가격)", 19800, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250726_95%2F1753504044738H2wNT_JPEG%2F1000009385.jpg"),
                            new SeedMenuPick("생연어사시미", 9900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231027_164%2F1698399103450CpBkO_JPEG%2F1000003682.jpg"),
                            new SeedMenuPick("차돌라볶이", 10900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231027_103%2F1698398809020Mo13W_JPEG%2F1000003684.jpg")
                    )
            ),
            Map.entry(
                    "15424746",
                    List.of(
                            new SeedMenuPick("새우와레몬갈릭치즈", 11500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MjdfMTgw%2FMDAxNzc5ODg5MDMyMjU4.8vL0hBLkx2Et-TOTpvoZWgW5GdMVm9rpB61wROW2jycg.lgcA43qXLxetrBqZ7ExstzMvvD5j717V94PwZyc5tN8g.JPEG%2FEF04AEA8-03A7-4095-B567-6DB64B271E99.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("허니디종치즈치킨", 9700, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTEyMTBfMjM5%2FMDAxNzY1MzQwNzQ1ODAy.9nhMn_V9o4Cwx-Bsrr-IjGDZR66Dows8WXoTZPBJkh0g.uF-aBOcso4FYII03oInj81mhPYOgYHFNS-bPW8R4vO4g.JPEG%2F1000023697.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("블루치즈햄애플", 12100, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTEyMjFfMjc3%2FMDAxNzY2MjQ1MjM4NjQw.HMNha7yxsLtB3x47P80yyorsfLtnni6Mx2KjrVYFk9sg.sNr8L_2k7Weg7sFjB3xbsHCGZ3PTNoKV5Czk9Jlaq3Eg.JPEG%2FCC77A1B6-AC57-482D-896E-1F2BE77EE4FA.jpeg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "7866028",
                    List.of(
                            new SeedMenuPick("마레 알리오 올리오", 18000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20151104_68%2F1446627391388UnlEs_JPEG%2F167054578649635_4.jpg"),
                            new SeedMenuPick("그릴드 텐더로인 스테이크", 43000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221018_45%2F166610191989362Jsc_JPEG%2F7CD368F4-E586-4D15-9ADC-2E00BB72248A.jpeg"),
                            new SeedMenuPick("치킨시저샐러드", 18000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20221023_244%2F1666495485521zT3Iw_JPEG%2FFEC16AD1-818D-47E1-B3BA-ADF917DC6EE0.jpeg")
                    )
            ),
            Map.entry(
                    "27089788",
                    List.of(
                            new SeedMenuPick("함박스테끼 정식", 14000, "https://naverbooking-phinf.pstatic.net/20260219_37/17714296932447gth0_JPEG/1749874088869.jpg"),
                            new SeedMenuPick("바질돈테끼 정식", 15000, "https://naverbooking-phinf.pstatic.net/20260219_170/1771429974354xtD7E_JPEG/1749874083947.jpg"),
                            new SeedMenuPick("차슈동 정식", 15000, "https://naverbooking-phinf.pstatic.net/20260219_71/1771429845972DTVeI_JPEG/1749874082837.jpg")
                    )
            ),
            Map.entry(
                    "571922427",
                    List.of(
                            new SeedMenuPick("새우관자오일 파스타", 21000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240510_53%2F1715325426658Ohfwr_JPEG%2FIMG_6099.jpeg"),
                            new SeedMenuPick("마르게리따 피자", 17000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250329_221%2F1743226194333MCF2u_JPEG%2FIMG_8262.jpeg"),
                            new SeedMenuPick("문어 샐러드", 17000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240503_125%2F17147187061836I0ml_JPEG%2FIMG_5957.jpeg")
                    )
            ),
            Map.entry(
                    "1323483346",
                    List.of(
                            new SeedMenuPick("구스 샤브샤브", 25900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231027_197%2F1698350216916aV3fW_JPEG%2FIMG_7978.jpeg"),
                            new SeedMenuPick("구스테이크 and 참나물", 23900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240810_235%2F1723281258830cb14H_PNG%2F%25C2%25FC%25C2%25FC.png"),
                            new SeedMenuPick("구스 야끼소바", 18900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240810_206%2F1723281519222ip2sN_PNG%2F%25BE%25DF%25B3%25A2.png")
                    )
            ),
            Map.entry(
                    "27495320",
                    List.of(
                            new SeedMenuPick("오리지널떡볶이(2인분+기본사리)", 13000, "https://file.smartbaedal.com/usr/menuitm/2013/6/20/201306201648_b02_1280.jpg"),
                            new SeedMenuPick("치즈떡볶이(2인분+기본사리)", 15000, "https://file.smartbaedal.com/usr/menuitm/2013/6/20/201306201651_b02_1280.jpg"),
                            new SeedMenuPick("해물떡볶이(2인분+기본사리)", 16000, "https://imagefarm.baemin.com/smartmenuimage/image_library/20211213/r_20211213_660.jpg")
                    )
            ),
            Map.entry(
                    "13086789",
                    List.of(
                            new SeedMenuPick("참치김밥", 5000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20170731_117%2F1501483834078QhGO8_JPEG%2F1.jpg"),
                            new SeedMenuPick("치즈라볶이", 7500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20160225_111%2F1456378347277nQCTz_JPEG%2F176175546246090_4.jpg"),
                            new SeedMenuPick("토종순대", 5500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNTAxMjlfMjIw%2FMDAxNzM4MTM4OTA4MjU2._4-2ZqMwW-ofOg3rrq3DvYenyEQGv6lQKflryvRcDBcg.Gq78O3DPlmairxlbvae7aFLk8P-e4NuyPsPcNHDqgIMg.JPEG%2F20240627%EF%BC%BF172334.jpg%2F2992x2992")
                    )
            ),
            Map.entry(
                    "1819200119",
                    List.of(
                            new SeedMenuPick("문어삼합 2인세트", 29000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20251105_202%2F1762322210070vbGBr_PNG%2FA33381F9-01C7-4EF5-B797-F90987BF5D04.png"),
                            new SeedMenuPick("족보(쫄깃한순살족발+보쌈)", 38000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20260403_133%2F1775180148474tkokd_PNG%2F23CE7D48-ABA4-40B5-BFC9-7FB595DE8679.png"),
                            new SeedMenuPick("문어사합코스(3~4인)", 49000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20251105_77%2F1762321318799vvahL_PNG%2FDFA252D8-0F20-44E7-BC6E-EE79D8223EF7.png")
                    )
            ),
            Map.entry(
                    "11160925",
                    List.of(
                            new SeedMenuPick("전통만둣국", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MDFfOTYg%2FMDAxNzc3NjE4ODgyOTM5.EBs8l84RbpoM4gm7PrGaPcPkwh8ZI0xWiMI20I0wZ8gg.zD63_AXjfTTQfhlD0goYQYttAmyOs-LYHDBnPgLWZEIg.JPEG%2F20260429_140036.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("녹두전", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MTBfNjAg%2FMDAxNzc4NDAyNTI5NTY5.eVKPl9W3nPxVtS7y2ytQe-YBqVP_IP-414MA9wZUlCEg.Fyu4kPD7NKkdNI9kO2PdFQlmRVazta5qPrKcYqkhLzcg.JPEG%2F95E0A8C2-9703-47D7-9EAD-A8F941DD837F.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("만두전골(소)", 37000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAxMjFfMTAg%2FMDAxNzY4OTIxNTcwODUz.UFCks80v-03NLiPPkfy52EmjAlElBk2EwuQ7gpXDR5Mg.vqFwU_-WkNPdy4YKYtYE5hjt_6b09hcqa-06XKI2h08g.JPEG%2F20251215_122011.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "13693145",
                    List.of(
                            new SeedMenuPick("양꼬치", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA1MTlfMjUz%2FMDAxNzE2MDk3MDczMTE1.5LG3xbeJLaB53nBzkBHA1ddNHJQft6hUdi1z8fG4n_0g.lJeO5GPB5KxW0UY8HfM3A1MWbE9mY04-9D2fz_gbnCgg.JPEG%2FDC5CB59A-85DF-480E-8059-D66A0A7F4065.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("계란볶음밥", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNTEyMjhfMTAy%2FMDAxNzY2OTI4NjEzOTM3.FFLSr77ChsiSUPGl72uHeXx20hB1sJ-1qeBBjYgnN-Qg.OTis85p7Ud_z2lM1ezN5xsUbUp_gW6OAm_Cfc3BlLw4g.JPEG%2FIMG%EF%BC%BF9495.jpg%2F900x676"),
                            new SeedMenuPick("돼지고기튀김", 18000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTEyMDJfMTM2%2FMDAxNzY0NjQ3MTE3MjEx.yjEXn2h6tkVtT9VlcQXu4YrOmBId5mRUJFj8grHQN7Eg.8oMEHtBIwXVjm6P9MffVV0uJAxMhHWn-dZKCN1VX5ZMg.JPEG%2F20251130_184359.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "2134375760",
                    List.of(
                            new SeedMenuPick("자이지파에 덮밥", 8500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAzMjlfMjY1%2FMDAxNzc0Nzc4MDI1OTM0.T5B3a1JVqLAMO9DemzbZ8ERnRuni5Y-yITnjMQO17LIg.t1KWgTJBcoZ87dYYzig5CQSzOnCJqbQ91omtdK_wRGgg.JPEG%2F1000064216.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("홀샤오로우 덮밥", 8500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA0MjhfNjcg%2FMDAxNzc3MzcyMTUyNjY0.t8KJ5dtWdoNTRBHdDngNSQ2kscWcSJ26KGDd0cdDWm8g.8216Srk5e4MjU7E_7dFx0iKMkFP_nPPmxF-NbDHpCX8g.JPEG%2F1000121221.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("사천마라볶음면", 75000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MDVfMzYg%2FMDAxNzc3OTc1ODc5MTk2.0h2YWL06qwbbx5uiCQQvf2LH74l7auiau_XtGXXe0aIg.uODuf80xJAC3_3p9XW-uNQojNvXAt5etPYvj1RnOFHcg.JPEG%2F1000013817.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "927297064",
                    List.of(
                            new SeedMenuPick("아나고텐동", 16900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210407_104%2F1617778342767RUaR1_JPEG%2FXT9f3NtWgKIVFF3foN00apLu.jpeg.jpg"),
                            new SeedMenuPick("규텐동", 16900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220102_20%2F1641050369119eEVep_JPEG%2FFE01C642-5ACA-4CA1-9FAE-7274EA3434FC.jpeg"),
                            new SeedMenuPick("토리소바", 12900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230519_192%2F1684507996244Sgjca_JPEG%2FIMG_0967.jpeg")
                    )
            ),
            Map.entry(
                    "946837172",
                    List.of(
                            new SeedMenuPick("전기구이통닭", 17000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240317_255%2F1710642126193zfFYa_JPEG%2F1000002262.jpg"),
                            new SeedMenuPick("마늘치킨", 19000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20160225_74%2F1456378631513zg6zo_JPEG%2F176175546729950_4.jpg"),
                            new SeedMenuPick("후라이드치킨", 18000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20160225_73%2F14563786312828GI4W_JPEG%2F176175546729950_1.jpg")
                    )
            ),
            Map.entry(
                    "2074141616",
                    List.of(
                            new SeedMenuPick("고추튀김", 19000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MTNfMjA4%2FMDAxNzE4MjgzOTYxNDcx.rwaPIg2_bPCOHauaxMUI97M_xAehY2JxwFyFgkmPdk0g._KXSN8TfhqrzsM3syajzI6b_DiAGyqO_0TF3pk0fxO4g.JPEG%2F20240613_203500.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("골뱅이무침(소)", 18000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzEyMDZfMTM2%2FMDAxNzAxODM0ODI0Mzc0.wYk3TKtaU1A6xDiB8yL_zo9mvON08s9NblhSvY3eB-Mg.uKC-JsRh7HixbJ_wftvvoYDUVh575fGiySu5Eq6EYKEg.JPEG%2F20231205_165900.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("해물파전", 20000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAxMDJfOCAg%2FMDAxNzA0MTcwNjk0NTYy.fZTF6xasww0J8gVEFLXTsQzjlRd23ZFG3pnOSw0y25Qg.TH-kFcyv6KqtQ3enMZaS7vrPHyTXJpLMvMaLVkOH_oog.JPEG%2F4054591A-D97E-4B6D-BF88-95B2C7CD56A8.jpeg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "10501014",
                    List.of(
                            new SeedMenuPick("물냉면+숯불고기", 11000, "https://imagefarm.baemin.com/smartmenuimage/upload/image/2020/12/28/4GMCSN8PbMqe9ogTPQ5kyVA9-9_aZp4JY8uuq0ksst6e1LZguHGN9YT2a7y41D_0.jpg"),
                            new SeedMenuPick("비빔냉면+숯불고기+냉육수", 11000, "https://imagefarm.baemin.com/smartmenuimage/upload/image/2020/12/28/4GMCSN8PbMqe9ogTPQ5kyfIt-ES9q1MVUxmmjCyU73Dg2CkjuLaVkF0CIvXxo0sA.jpg"),
                            new SeedMenuPick("왕만두", 8500, "https://imagefarm.baemin.com/smartmenuimage/upload/image/2020/12/28/4GMCSN8PbMqe9ogTPQ5kyRRL7Nah482-ViwIOthhyswlCvR7eiWT-lpk2mszq3mY.jpg")
                    )
            ),
            Map.entry(
                    "60259859",
                    List.of(
                            new SeedMenuPick("참치폭탄김밥", 6000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250819_84%2F17555805265514aCQq_JPEG%2F1000039555.jpg"),
                            new SeedMenuPick("제육덮밥", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250819_287%2F1755581507312zJKY4_JPEG%2F1000039558.jpg"),
                            new SeedMenuPick("치즈라볶이", 7500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250819_149%2F17555807621385MBU3_JPEG%2F1000039556.jpg")
                    )
            ),
            Map.entry(
                    "21324889",
                    List.of(
                            new SeedMenuPick("빅맥 세트", 7600, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAyMDZfMjA4%2FMDAxNzcwMzQ5OTQ3NTEx.17IdNFOxx2ENW30LJ-XVkaPbour8OBy13Mml3S5tS_Ig.9XUlQpn25cwoQxQBKrkLlxDL5Z3UwaX2DrGiHg4LpYkg.JPEG%2F20260206_122257.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("상하이 버거세트", 7100, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAzMjNfMjg2%2FMDAxNzc0MTk3ODkwNjQ5.wNbwMm3uj-0BBGk2isisi3HThxeBlj22Kyli52Jd_l8g.6ynFr60QF23FzSo9o-7IT2O6eZWQlw1_3wDW0eu3jSwg.JPEG%2F5A8526BE-BF0F-4FAC-90CB-1352130B1AB5.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("감자튀김", 3300, "https://topclass.chosun.com/news/photo/202406/33309_46673_2041.jpg")
                    )
            ),
            Map.entry(
                    "14512484",
                    List.of(
                            new SeedMenuPick("김치떡볶이", 13500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200718_82%2F1595068025700uYO4g_JPEG%2FjR4pUMgqIhQOdwxfB2laWQbe.jpg"),
                            new SeedMenuPick("치킨 피자 김치떡볶이", 26500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200718_191%2F1595068110374Lzspq_JPEG%2F5tlYZ1CTeMlo6TobA_NKLkmP.jpg"),
                            new SeedMenuPick("오징어 튀김(8개)", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211119_155%2F1637311680093RnnHE_JPEG%2FIMG_0805-2.JPG")
                    )
            ),
            Map.entry(
                    "15546985",
                    List.of(
                            new SeedMenuPick("부대찌개(밥포함)", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzEwMjVfMTMy%2FMDAxNjk4MTgxODYzOTM0.hj4oJH_HUTsFBeXn2q-tnZaSWI_YLeUg-oBg3hjBWMIg.WuBJLveLAk4VgcVCidnuD1zZV7qUTFCuOkw5Zu0KZ_cg.JPEG%2Fupload_0d48a69bd01c65c05d19ea9b448a7003.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("소세지사리", 2000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250702_33%2F1751461667213KlNgN_JPEG%2F1751461600591.jpg"),
                            new SeedMenuPick("라면사리", 1000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMjEwMTdfOTkg%2FMDAxNjY1OTkwNTE5NjE1.hxNlpeue1V_-d7YauxELetkYbMlcZr3Q-WqW9grgIsIg.N3yQQFHSjzakscLlN-X6_2WOSafwUYcJaSu3M4g1nAUg.JPEG%2FCA69B85C-3AF8-4154-A8A6-EDEAEA228B4E.jpeg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "24449631",
                    List.of(
                            new SeedMenuPick("순살 치킨", 12900, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F766cb7187674c576be682a818710da5d1d504ccb%3Foriginal"),
                            new SeedMenuPick("짜파게티개", 8900, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flocal%2FkakaomapPhoto%2Freview%2F80977fc3babef7b7f780294e740b9694f8eb7320%3Foriginal"),
                            new SeedMenuPick("별난감자", 15000, "https://img1.kakaocdn.net/cthumb/local/C800x800.q50/?fname=https%3A%2F%2Fpostfiles.pstatic.net%2FMjAyMzA3MTRfMTMy%2FMDAxNjg5MzQxOTkyOTA4.PY_PljILXPscITs0gWxuhSnxVkTAP2nf-WuPHDRRMw0g.Xvq_58HIqYDAIFdNzzeL2iKGxAjoUOH7JthHGW5FHcsg.JPEG.min_glet%2FIMG_2753.jpg%3Ftype%3Dw773")
                    )
            ),
            Map.entry(
                    "1949561591",
                    List.of(
                            new SeedMenuPick("김치찌개", 3000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDExMDFfMTEw%2FMDAxNzMwMzkyODgxNjEx.tMw4niFT3Pc2Rdvp8E45OhorIOUBRgx8un-M_TK5Ikkg.lLVj40zmpSYD_4uzHfepYAI0eFXrufGmgw3-QgMPokgg.JPEG%2F74CCB4AA-F673-41F4-9A9C-F2A3D0933EDE.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("라면사리", 1000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAzMTNfOTAg%2FMDAxNzczNDAxNjAxNTA5.gOW0-cQbr9Y1LzBGhgBGM_KA2jRS__dWkNxII1w7suQg.i1b0fmo65hm29UZKaaEeBYkSQ0gHgtQ06TSwG9XD4EMg.JPEG%2F20260313_193545.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("고기추가", 2000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20201204_71%2F1607071277954AuFwx_JPEG%2FuRxQvDiSSU50AeCqOi5N0ufI.jpg")
                    )
            ),
            Map.entry(
                    "16819186",
                    List.of(
                            new SeedMenuPick("바지락칼국수", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAzMDlfMjgy%2FMDAxNzczMDM5OTI3NTE3.Er_as9yygYLm0YrZ_k7KuBCWp__zgmaqHpk8LyNVQtsg.-QujsMAX6sL0QDFFe9kT09m0MUCMaPw-c0WlKWdfvlwg.JPEG%2FKakaoTalk_20260309_151206420_07.jpg%2F1689x2423"),
                            new SeedMenuPick("닭볶음탕(중)", 33000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAxMjZfOCAg%2FMDAxNzY5NDIxNDA0NjA2.zxLAADzVSCl3iBGdZGHmR3HL4U5whkGV46ZcWfS2j8Ug.OS1mNgjW8GFo-4AL2BMMBg_h3BKXwCWF7p0LaG3FRk0g.JPEG%2FIMG%EF%BC%BF3889.JPG%2F900x676"),
                            new SeedMenuPick("얼큰수제비", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzEwMjdfMjMx%2FMDAxNjk4NDA1MTgwMzI5.LlpgrtujHvOs-rCH0wqacsuBM3j-HxUZWxIRcYq88Wgg.fIRcgHrmFANOVXR9DzFZZ4JFKx8tLD9RT89FOfv21zgg.JPEG%2F20230922_121106.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "13007118",
                    List.of(
                            new SeedMenuPick("강황 오리주물럭", 49000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAzMTlfMTEg%2FMDAxNzczOTE3MTQ3Mjgy.uZ42ZgJj5vaQosaAWdUDx9baAf4NqcYm9Pq0n3SDUlIg.zJoNcRvA68UJkitwBdD3QJHgj7JjqWr7VnG1Pfw6aB4g.JPEG%2FIMG%EF%BC%BF7365.JPG%2F900x1200"),
                            new SeedMenuPick("강황 능이한방 오리백숙", 79000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTA5MDVfMjc1%2FMDAxNzU3MDIxNTMzOTk3.ZHq5j5-LTBRnEcnTeKN7prQr966B-dfx7PLEgTFo88wg.D3f-kYtv-pBAQMhBzdJc7sfazMGhC4pf_nVBckF1icIg.JPEG%2F1757021379778.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("김치볶음밥", 3000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAzMDFfMjIx%2FMDAxNzcyMzQwODI4NDU4.Ym33cQEwRYlf4P5tHLd5NFVnJjhtYbGFN7u0gfQ8J9sg.vA4-IwLp09kaIrRxfNz2_hPgRCC6R5SI1DJVXfs7Rhkg.JPEG%2FIMG_0282.jpg%2F4284x5712")
                    )
            ),
            Map.entry(
                    "25671309",
                    List.of(
                            new SeedMenuPick("1kg 포장", 55000, "https://source.unsplash.com/320x240/?korean-food,%EA%B0%90%EC%9E%90%ED%83%95&sig=25671309-1"),
                            new SeedMenuPick("소금구이 1kg", 60000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNTExMzBfODYg%2FMDAxNzY0NTAyMTQxNDU0.XwgDuT6nbkv1Awv7bK_XMvQMujSKt7PEt_Wn-waQxTkg.NCKR7P-U_KDe4kbKRx4rhH6ZHibkjQ197RHk3Un3VTEg.JPEG%2F900%EF%BC%BF20251124%EF%BC%BF191105.jpg%2F900x1200"),
                            new SeedMenuPick("양념구이 1kg", 60000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNTEwMTFfMTM2%2FMDAxNzYwMTU4OTYzNTA2.PjY9EoQEtAvumiGAxcV8-T4I3mVJrHLr7U9kuTH06uEg.A7inmpkL9J6ytZdldDAsOBfL9dDIZxDe8DyHx9MJdmcg.JPEG%2FIMG%EF%BC%BF1535.JPG%2F900x900")
                    )
            ),
            Map.entry(
                    "15796495",
                    List.of(
                            new SeedMenuPick("콩나물국밥", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNTA2MTZfNDEg%2FMDAxNzUwMDUxMjAzMTcy.pCsQlinFcPjtZoJEnVmi25SZSZaFhvPEyzT0MPJaeiQg.kEsn3H1dQIRyWhrYn8yRA5LE8NoXAb9DTq5YNPABrNUg.JPEG%2FP20250614_142512608_C7606A8C-5353-4DF4-A7DB-A4A4C58430E0.jpg%2F2885x3633"),
                            new SeedMenuPick("메밀부추호박전", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAzMzFfMjMg%2FMDAxNzExODk0NjA4MTQ3.XGxx0LnGmsxml_-9nf3EmBKAiU_gez_Q7Utsu8sVnQkg.CBbFlh1iDCuxx8tuFUx0j46XvWILGD8pGKY-ytJdN90g.JPEG%2F65280DB7-295A-4BFE-A46A-ED983902F84A.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("굴국밥", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAyMDRfMjkw%2FMDAxNzA3MDUwNzMyMzkw.m0DkEkC2AvRd1BL9DPqNBBc6q8NACkKWVep9fRWbgvEg.OwLGUwohSTB5NZjGO249HzIYw3cXME4waH-stZvu5UEg.JPEG%2F20240128_114156.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "186578604",
                    List.of(
                            new SeedMenuPick("모둠전", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTA4MjFfMjU4%2FMDAxNzU1NzgyMjEzNDI2.R0rJLivl-Xbyx-VsiVS_Ae3Mes4ec73N4y9l5pSTbxIg.YaY8lkBMiCgpwuK62GwqD0Wujv0pv-BUa2-R7D5Y58kg.JPEG%2F20250821_161809.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("새우전", 22000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzEyMDdfMjI5%2FMDAxNzAxOTE1Mzc1OTAy.pFt19oxaMoDv2I9oFk9MoVzOloEsp_JnoQdPbPhKTjYg.S57esGOYI6cCUPkyEt4M-c_rnvmOV-fk-4piiafBOFIg.JPEG%2FBE5DC3B6-BFF8-4CD0-83BD-36CE416BF9F3.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("막걸리", 6000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzEwMjBfMjc5%2FMDAxNjk3NzM2OTE5MjY4.YAWBy-6nVkHlI7yugafH45xZx50abD74Zh7jmP7cRb8g.D6DwsPV4IW452p_qchf9yJSQuYBjtKNctx0Mfae4e3Qg.JPEG%2Fupload_1812472dd3659c31cd445926be15f4e8.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "1962671869",
                    List.of(
                            new SeedMenuPick("만두국", 9000, "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAyMTZfNjYg%2FMDAxNzM5NjY1MDAzNTI3.yNXAWBkph_9VVZYYFbbuPq86UMScdxW4uI4uav6NRgEg.7tLFD_wtv_Ll2c4xtZRNZ-uQKN9zcH7ATcLJ3wF0NwUg.JPEG%2F20250215_140436.jpg%234000x3000"),
                            new SeedMenuPick("냉동고기만두", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAxMjBfMTY1%2FMDAxNzY4ODY2ODkyNTEy.8xCBE3uoFLCF87Z_yuws0ASZ8kiLH_Z_jVuxEblC2zMg.ojExtsiLo0pXuywrjlKRaADM6HnQfbll3lckwgafE-Qg.JPEG%2F900%EF%BC%BF1768866892004.jpg%2F900x675"),
                            new SeedMenuPick("냉동김치만두", 16000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAxMjBfNDUg%2FMDAxNzY4ODY3MTA4NTUy.uzgqZ1UBD4KsUBk5DQIIL4zJaaO5PIRhTY44YNyewDQg.3qAYKDARKjicBZFfKV2TDKuMQ4if-LmsxSWMyToro5Ag.JPEG%2F900%EF%BC%BF1768867108194.jpg%2F900x787")
                    )
            ),
            Map.entry(
                    "10380858",
                    List.of(
                            new SeedMenuPick("메밀묵", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAxMTJfMjE0%2FMDAxNzY4MjAwMzIxNDg0.7O0C6on_7R6AwY0Ped_2P5Xn7LLUa18suaYYS4UGEocg.2re0sr0z2Rd151t4cIf3t3zAHnBfZcZ_Cy5MWj84occg.JPEG%2FF75F2450-9D65-4C29-B207-B53CE90544B5.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("배추전", 7000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTA3MTNfMzYg%2FMDAxNzUyNDEzNDg1Mjcx.kUB-0U1wjwpWiwQwfWyEjaNva-nXEmQEiRAr_Acw5a4g.O3pVVouSIWqmHjPhdSNp54u4-ZPbXS1nWVW1gnOcJJQg.JPEG%2F6846E672-C37A-4E26-B7D7-6F9857DEDAC6.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("만두국", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MDlfODcg%2FMDAxNzc4MzA5NDY3Mzg1.x7wt-ZPa7e2fkimbE04doxpzMdkoUsMh2Jjow00oUQEg.ymS2MtUw7lIZnB5PHWrE6rZA4JLcC8MnUWLHWTRXPskg.JPEG%2F20260509_120943.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "1536393758",
                    List.of(
                            new SeedMenuPick("데미그라스함박", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240426_174%2F1714091270668goOwd_JPEG%2F1000010187.jpg"),
                            new SeedMenuPick("청양크림함박", 13500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240426_72%2F171409129477815cCb_JPEG%2F1000010198.jpg"),
                            new SeedMenuPick("구운버섯샐러드", 12500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTA2MDVfMjY3%2FMDAxNzQ5MTI0MDExNzI5.J_L1YI8Ee1dKeAqKFGFfGlk5OpZ-r27wXnbuaaKvLxUg.bbf97k6GI_VRZNjBcxWl0lPf2JcL2tOB00WFr4bs4GAg.JPEG%2F20250605_191736.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "10447001",
                    List.of(
                            new SeedMenuPick("보쌈정식", 22000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA0MDdfMTMw%2FMDAxNzEyNDYxNTAzMjM4.7IBaCWcQcdVGuY_1n3D-dRNB31jNhA4Mxo8mKKq220Mg.G1XcbZG-VgmViHep_yqpezbWR_ogOd32zlS6y2AL6RMg.JPEG%2FF6DCF660-D22F-475A-8E67-664A621A5C6B.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("황태찜", 25000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200320_272%2F1584690391639ntJBz_JPEG%2FEWfmAvkD1baWpndz46oJW786.jpg"),
                            new SeedMenuPick("삼합", 50000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20200320_179%2F158469062369656LQY_JPEG%2FRENWUKehGCsB1oDYkg0D2qEi.jpg")
                    )
            ),
            Map.entry(
                    "1555591848",
                    List.of(
                            new SeedMenuPick("곤드레비빔밥", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAxMTlfNTMg%2FMDAxNzY4ODI4MjY3NzQ0.oLU5SeH8kuGGEErNkeXO7tcmr4Y0KFwHZgQ0ePQyHygg.6j4zZKi1LOY_uCoGn9BYVl6zc2-FEPaWfrJlOTQ9-9Yg.JPEG%2Foutput%EF%BC%BF54481256.jpg%2F900x1200"),
                            new SeedMenuPick("코다리구이", 7000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAyMTRfOTYg%2FMDAxNzcxMDU0MDc3OTk4.KCtuNVUZNLJ4t8ViAC3NvVUXGWyEK04w_P_FdDolkkkg.O6ctVYY7B2UcqVhaIw-iRW3fe4h0enVJnAbse9TYGWcg.JPEG%2FIMG%EF%BC%BF3891.jpg%2F900x676"),
                            new SeedMenuPick("오징어볶음", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA3MjlfMjQ2%2FMDAxNzIyMjI3OTIxNTYz.4xX7uPKYJC0kmdiUeuAalQslopMch5iPmsIWgXaLVIkg.TJX471u6TTDtEl4lMn__k4YElRIy6Jqwxh1ND4TjC04g.JPEG%2F20240728_122523.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "23296143",
                    List.of(
                            new SeedMenuPick("옛날칼국수", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTAxMDNfMTU0%2FMDAxNzM1ODk5NjA2MDQ4.e9E3YW-4TcgCS5icY7tHtv6d4EkKVtKJcXH2RyUR53kg.alzvyfUpxQwtg1a6_E29XocIaO1UxngmVBvvBUlfMowg.JPEG%2F1000025291.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("동태전", 15000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MDhfMTY1%2FMDAxNzc4MjMyNzQ1Mjcz.Dn5cmJ8Gp6c6n8ew6YkHgEef42prlrWStVYGyG9E-3Ug.oj_sGwTc05fFBTqyfFibALOHC2lZTUi_grYZooXm83Ig.JPEG%2F20260508_124737.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("감자전", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAyMDlfMjQw%2FMDAxNzcwNjEyNTg2NDI1.9ljlM3h1qukEspso1e3MVEa218wncsHLtDeXJjKNSyog.kfHygx7GGhWM9VfCEWUXd_Y4xbltly6e25IcGsupLWUg.JPEG%2FAC14492E-2631-43E1-8B49-C47AC0712DA7.jpeg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "1371384450",
                    List.of(
                            new SeedMenuPick("짬뽕", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAyMjBfMTg5%2FMDAxNzcxNTgyMDQxMTM1.duGlesH2xMLL79fvhb3L0LET34HOF1fgQvrErOdxwm4g.AFjgDkS_ZTEICeaN-b7Nfm-oMA093r5J1HcDeAWILuYg.JPEG%2F1771580161266.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("유린기", 25000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAyMjBfODAg%2FMDAxNzcxNTc5NjkyODYx.ybVwuBkoOX6C5eeeqnH1HeSX4gSR4Mdi-M8_Ynw7Apcg.2JHGcf_p8l2b0EuBSiaHCmj2a51P2TpMK5XfR9gWRjkg.JPEG%2F1770117538423.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("짜장면", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MTZfNDAg%2FMDAxNzc4OTI1MzMzMDIw.Q1g-GFZ1sFzWpps_Q7BuMrh1JXGvJuAgSuVc3jN3p80g.vx33pJA-1JIpOyETOz8IfvNYe87o5BGkezvTOTQKDe8g.JPEG%2F20260516_171757.heic.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "1823707163",
                    List.of(
                            new SeedMenuPick("튤립닭발 숯불구이", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250403_104%2F174366378285856SIG_JPEG%2FKakaoTalk_20250403_154018810_11.jpg"),
                            new SeedMenuPick("뼈없는닭발", 15000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250403_187%2F1743663524796uUz80_JPEG%2FKakaoTalk_20250403_154018810_08.jpg"),
                            new SeedMenuPick("계란말이", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250403_8%2F1743663737824KJXw3_JPEG%2FKakaoTalk_20250403_154018810_09.jpg")
                    )
            ),
            Map.entry(
                    "17893699",
                    List.of(
                            new SeedMenuPick("백두곱창(250g)", 25000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAxMjdfNjgg%2FMDAxNzY5NTE3OTk5NTI0.S9EN1jlZYmZrouDDgXXwVb64RTYFIErs0AoS2h7o0ewg.F4OhYZmGYyo1SNzhjPo2ZWeMRtOrVVmHPWQE8yeahh4g.JPEG%2F20260126_203240.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("볶음밥", 3000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTAzMjBfMTY2%2FMDAxNzQyNDc4NjMzNTU3.0CzC2Ta9H4PgjjauZBTGjc58lRDGHEFBjHhjPiDYg3Ag.YlUBFMCP_r-vKNR3YPfUanfEpQJ8fEXv47LZJuxdCJIg.JPEG%2F2B85B212-27EA-427B-AF33-ADD897D2A358.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("백두대창(250g)", 25000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA2MTZfMzUg%2FMDAxNzE4NTA0Mjk5NzE2.v1z5WKe0znb8byUscuwXS-IiLbQbsCPr5JxsLPD3lOwg.BBzkdQ9P1mcHhooHXKwXROEHVt0Gh1-LpJuUGOI9uoAg.JPEG%2F20240612_190121.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "2050246779",
                    List.of(
                            new SeedMenuPick("제주 생오겹살 170g", 16000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240722_115%2F1721617429673LDnS0_JPEG%2FIMG_0440.jpeg"),
                            new SeedMenuPick("근고기(모둠) 600g", 51000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240722_144%2F1721617297475WxpYQ_JPEG%2FIMG_0435.jpeg"),
                            new SeedMenuPick("벌집껍데기 170g", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240722_290%2F1721617238893tfpJ3_JPEG%2FIMG_0441.jpeg")
                    )
            ),
            Map.entry(
                    "7988170",
                    List.of(
                            new SeedMenuPick("잡채밥", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTEyMjFfNDIg%2FMDAxNzY2MzAwNjk5NDQ4.1WAS5NMJhDWzJNv6Sz0GxLwTcU9Zak7y6nym1gt355wg.jQ_qBGApQQS2dr1LntWgD3WOM1haJp__-xTiAeKOHiog.JPEG%2F20251220_123450.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("삼선짬뽕", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTExMjhfMjM5%2FMDAxNzY0MzAxNDk4NDQ2.QNdBuiyN0um2JZ1dzV6Pywruwp7D20wf19oRPRS_gYAg.U3Rsw88LLWQyvW-oFCosive8wgss90FzhnH6BO685yog.JPEG%2F49809.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("탕수육", 15000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA0MjNfMTk1%2FMDAxNzc2OTQ5MzM1OTU0.o_ZlfLQqe6r7O-Oxf6pO97NNbCr05JPizyXn9q7ZIdQg.3hqQsJu7fx-XDAn2-KdnA54G1-EynZbHJL-uQ9M_MN0g.JPEG%2F230299B5-C442-4623-ABB5-EC98BE446DF7.jpeg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "10644213",
                    List.of(
                            new SeedMenuPick("탕수육", 18000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjAyMjNfMTky%2FMDAxNzcxODEzNDk2MjIz.LVBXyDkZynbBKV4OpKiE1P3s1BQ1TGWJd-Yu_agzPcwg.UZ428Xo0Uy7MdmMdtvj2ZDRV_lpcn17TOXzdXwnZdbYg.JPEG%2F9143.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("짬뽕", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA0MDlfNzgg%2FMDAxNzc1NzI4Mjk2MjA1.LcdY8mEtacEv9fuQ0XHICUH6nGD1xt1K20fIfddkOHgg.XWE0huQo2pXmgJhcehyUW_qM7TCLC-VPIhKD4Q-c010g.JPEG%2F1000077451.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("간짜장", 8500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA0MDVfMzMg%2FMDAxNzc1MzkwNDU2NDA4.fKA8KLSu6DLVufQ1QyU3cgofQ6PqWwLM1sWS46impIUg.0RIFHLT4K6gKPoAsq_q54X5QdTni-jNEB_RDTU56sQ0g.JPEG%2F1775390246231.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "731249424",
                    List.of(
                            new SeedMenuPick("야채김밥", 4000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAyMDJfNTUg%2FMDAxNzY5OTkwMDE0NjMz.3RIBzcPg90wUVG29c046BxHu8nEtei9jrDG0MMxUlA8g.SKq3Qg6LfkRhN7-smJ9Tsxxp4DsDAHyVMA-6gHk1NA8g.JPEG%2F900%EF%BC%BF20260114%EF%BC%BF183857.jpg%2F900x1200"),
                            new SeedMenuPick("계란라면", 5000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTA2MDhfMTYw%2FMDAxNzQ5MzYzOTQ4NTk4.4RWsUGLIabPWO-eW6lCJDUjsfenYAbTgvF6VnA5V7I0g.cwdjk1jPWXIbcnOfjSCo8ObI1rteUkPBiURI5RfUSVkg.JPEG%2F5DA78B82-FC0C-4ED8-98EE-D0E297B65645.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("치즈 떡볶이", 8500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzAzMjdfMTcg%2FMDAxNjc5OTA5MTA3NTgx.qskbzY1cN3Rx8JXWQqxJAyRHB8SBZrxpkLQ_d1tAJkwg.k14CJcIwtpiFg-sae8qAIBh_X2CbZgrOGRX_hQnl2jgg.JPEG%2F20230327_175803.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "1702681001",
                    List.of(
                            new SeedMenuPick("다판지(소)", 28000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250806_196%2F1754480160767ckp3A_JPEG%2FIMG_0043.jpeg"),
                            new SeedMenuPick("마파두부덮밥", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTEyMTJfMjY5%2FMDAxNzY1NTE0NTg5NjUw.ws_zW4X5LGBIPxDOuqD0z_7oAQtlWf2xF4RyxGD8ArMg.zTb8D-KQSEFJakbiIanlzy-o4kSU3MRsT8YQLxeRFG8g.JPEG%2F79C9351A-23A6-46EC-B6D8-1974D0E1378B.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("고추잡채덮밥", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fblogfiles.pstatic.net%2FMjAyNjAyMjFfMTYz%2FMDAxNzcxNjgyMDg1OTk1.kcCNaaDf15iYbRk2uDFP9th53Dyn8I7xSJb0S5HmwPcg.fA3FBAdRAl0jn-_05DRSRvEKH1TbEhQCYgDlV4aPAEIg.JPEG%2FIMG%EF%BC%BF6136.jpg%2F900x1200")
                    )
            ),
            Map.entry(
                    "1649096796",
                    List.of(
                            new SeedMenuPick("왕특대 1kg", 85000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20201214_58%2F16079432649390Qkdt_JPEG%2Fgp69CZebzpJItS52SqoNqR_o.jpeg.jpg"),
                            new SeedMenuPick("특대", 61000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20201216_276%2F1608102996605fgo6R_JPEG%2FgqFkA56C4tneQuGrFEPXCNWt.jpeg.jpg"),
                            new SeedMenuPick("장어탕", 7000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20201215_245%2F16080084853101h2dF_JPEG%2FzECQvpFLGYqZkmaF8vx_hPkz.jpeg.jpg")
                    )
            ),
            Map.entry(
                    "15623027",
                    List.of(
                            new SeedMenuPick("간짜장", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDEyMzBfMjYz%2FMDAxNzM1NTM0Mzk3NDUy.lWS9zFcemk8cK6vD953KX95g9wPgtsG7QbgVyJMmOxIg.tE0XUCZ4NPX7mPI9i-VjMb99PMunp_Nw-AJY31akqQkg.JPEG%2F20241221_113253.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("탕수육", 20000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTAzMjBfNDUg%2FMDAxNzQyNDc1OTY0MjM3.F0XDEa1FePNSQCodKVqvvK1YyQ9zg91yQ2xQ1AzBOMUg.fTgw6de0cVpBDKeKEO2gGIAJ2du24-6EOxWcE-KQ_4Eg.JPEG%2FFB0E31A6-BEDD-4565-81AA-BB65C8427911.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("짬뽕", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTA3MjBfMjI3%2FMDAxNzUyOTQ0ODk5OTA3.X6lQ3nDGV4lFMLXehvw_Cfi_lS_kHoCHI581QZv-ZX0g.EyFRC5_0qZj9ZboflbgHmztA7Rm2NN-U_pmlGK8ouXAg.JPEG%2F9244DD50-B03B-4FC4-99E7-0A47029E5744.jpeg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "25401969",
                    List.of(
                            new SeedMenuPick("야채곱창", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNTAzMTNfMTkw%2FMDAxNzQxNzk3Mjg2NzM4.W1pVb9tiR1e6v_Ja8tYOZbbXVZvVLYgNhzAcCL8Cm1gg.KRFXDSxMsg2dZCL7PGydE0oh2zpbfEEPx1l6428eAJYg.JPEG%2F1000005881.jpg.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("순대곱창", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMjExMDJfMzgg%2FMDAxNjY3Mzc1MzY0OTU0.kqN2Hv8PmV8DYYrQG1ZvEiN8xIbEFJaPMfhmL28kbKcg.aQD7OczpoDO4nG6D1Po6TXxY247WMumqQHVz8IVqRxQg.JPEG%2F3FCBA0EB-B991-4680-A3D9-3AD219C51165.jpeg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("소금구이", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDA0MTFfMTgg%2FMDAxNzEyODMzNDQ5MjYw.sKpSR5namjuTib2De_9gewTbYlwC9YxSwpg7oGOm6U0g.dsZLreFF4EDmd_aak-7PoS4CbdKGmzH_qmknibeZCsIg.JPEG%2F20240411_190828.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "402903717",
                    List.of(
                            new SeedMenuPick("무한리필", 20900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250417_260%2F1744874776633CHHxu_JPEG%2F209.jpg"),
                            new SeedMenuPick("무한리필 초등저학년", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250417_260%2F1744874776633CHHxu_JPEG%2F209.jpg"),
                            new SeedMenuPick("무한리필 미취학생", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250417_260%2F1744874776633CHHxu_JPEG%2F209.jpg")
                    )
            ),
            Map.entry(
                    "1016028633",
                    List.of(
                            new SeedMenuPick("후라이드 치킨", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220111_228%2F1641883225806DNfFk_JPEG%2FR0015526.jpg"),
                            new SeedMenuPick("양념 치킨", 17000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220111_65%2F16418832568409QVDi_JPEG%2FR0015551.jpg"),
                            new SeedMenuPick("닭똥집튀김", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20220111_274%2F1641883297761GiM5T_JPEG%2FR0015555.jpg")
                    )
            ),
            Map.entry(
                    "11744410",
                    List.of(
                            new SeedMenuPick("능이삼계탕", 15000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230802_198%2F1690957963597ahTQ6_PNG%2F%25B4%25C9%25C0%25CC%25BB%25EF%25B0%25E8%25C5%25C1.png"),
                            new SeedMenuPick("오리탕", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230804_26%2F1691075508951nV857_PNG%2F%25BF%25C0%25B8%25AE%25C5%25C1%25BB%25E7%25C1%25F8.png"),
                            new SeedMenuPick("주물럭", 48000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230802_264%2F1690958022186BU7Ms_PNG%2F%25C1%25D6%25B9%25B0%25B7%25B0.png")
                    )
            ),
            Map.entry(
                    "843250339",
                    List.of(
                            new SeedMenuPick("소내장 쌀국수(포루얻)", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230913_107%2F1694597827873KuJi7_JPEG%2F%25BC%25D2%25B3%25BB%25C0%25E5_%25BD%25D2%25B1%25B9%25BC%25F6.jpg"),
                            new SeedMenuPick("돼지내장 쌀국수(포자우)", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250225_272%2F1740490375439v2BY3_JPEG%2F1000000075.jpg"),
                            new SeedMenuPick("소고기 파인애플 볶음밥", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA1MDVfMjgy%2FMDAxNzc3OTYwMjI5Mzc1.bFmrSoLQyVFGurtJUZLhrKrnlwk80L5shg11gmKSFLog.zULE1WKb_I-mRNKbJuAh979bdPjxPOLhKAAijeX970Ag.JPEG%2F20260505_144918.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "389501703",
                    List.of(
                            new SeedMenuPick("고기 더블 소고기 쌀국수", 15000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20231004_53%2F1696403404576cP8Hk_JPEG%2FIMG_9350.jpeg"),
                            new SeedMenuPick("팟타이", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyMzA2MjhfMjAz%2FMDAxNjg3OTI5NDI1Nzgz.FKh5esOXISGQl8mXbuzRHju3J4wUroD5uqHxY2aLvA8g.qiB--BgtaYdfeKB1GQQVPn-nUy_VBQTdqDhk1ykRhxsg.JPEG%2F20230627_115216.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("똠얌무 쌀국수", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNDAxMTJfNiAg%2FMDAxNzA1MDY1NTY0Mjc5.38eUTYyms6KutNHDqOfs4iFcO_CqS_EdD7Uds9C2pycg.PvxY2RenzAGiB6uaeQHmKCpePibDcwk9L0Z2IT-So7wg.JPEG%2F1705065396469.jpg.jpg%3Ftype%3Dw1500_60_sharpen")
                    )
            ),
            Map.entry(
                    "1328344498",
                    List.of(
                            new SeedMenuPick("나시고랭", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240103_179%2F1704272249930WLhi6_JPEG%2F1000002169.jpg"),
                            new SeedMenuPick("팟타이", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240103_174%2F1704272165595KLe82_JPEG%2F1000002170.jpg"),
                            new SeedMenuPick("미고랭", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240103_212%2F17042722131212G6DR_JPEG%2F1000002171.jpg")
                    )
            ),
            Map.entry(
                    "192029925",
                    List.of(
                            new SeedMenuPick("한우사골 쌀국수", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240122_217%2F1705895986164Lvgi2_JPEG%2F1%25C6%25DB%25BA%25B8.jpg"),
                            new SeedMenuPick("얼큰 소고기 쌀국수", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240122_116%2F1705896020259erJhN_JPEG%2F2c%25BE%25E4%25BA%25B8.jpg"),
                            new SeedMenuPick("새우볶음밥", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250331_14%2F1743417041029QghPq_JPEG%2FKakaoTalk_20250321_151436455.jpg")
                    )
            ),
            Map.entry(
                    "12768652",
                    List.of(
                            new SeedMenuPick("미니월날쌈+미니양지차돌국수 2인세트", 20000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250501_32%2F1746065195146WXADo_JPEG%2F1746062937844.jpg"),
                            new SeedMenuPick("양지차돌쌀국수", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fpup-review-phinf.pstatic.net%2FMjAyNjA0MjhfMjAg%2FMDAxNzc3Mzc2MjY4NTc4.1KoZwOfhatbYxNJ3sAo808y0Py-XiYaaWJzV2lnCKuwg.5Uq8ZnVsWOlXOJGQJmdr0DSd-9fcfYWYIZ8Pk91szIcg.JPEG%2F%25C3%2583%25C2%25A3%25C3%2582%25C2%2585%25C3%2582%25C2%2582.jpg%3Ftype%3Dw1500_60_sharpen"),
                            new SeedMenuPick("분짜", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20240523_112%2F1716440426246iBblu_JPEG%2F5.jpg")
                    )
            ),
            Map.entry(
                    "1300657734",
                    List.of(
                            new SeedMenuPick("쌀국수(PHO)", 11500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250822_5%2F17558519592265I50q_JPEG%2F%25C8%25AD%25B8%25E9_%25C4%25B8%25C3%25B3_2025-08-22_173039.jpg"),
                            new SeedMenuPick("껌승(갈비덮밥)", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230630_148%2F1688110106639n1NlL_JPEG%2F06-%25B2%25AD%25BD%25C2.jpg"),
                            new SeedMenuPick("분팃느엉(비빔국수)", 11500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20250216_252%2F1739680935844t915j_JPEG%2F1000011595.jpg")
                    )
            ),
            Map.entry(
                    "2004094531",
                    List.of(
                            new SeedMenuPick("양지차돌쌀국수", 8000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230501_279%2F1682917345090jwpHJ_JPEG%2F%25BE%25E7%25C1%25F6%25C2%25F7%25B5%25B9%25BD%25D2%25B1%25B9%25BC%25F6.JPG"),
                            new SeedMenuPick("치킨 쌀국수", 9000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230501_212%2F1682917523884rY6dX_JPEG%2F%25C4%25A1%25C5%25B2%25BD%25D2%25B1%25B9%25BC%25F6.JPG"),
                            new SeedMenuPick("분짜", 15000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230501_214%2F1682918100795JPsAh_JPEG%2F%25BA%25D0%25C2%25A5.JPG")
                    )
            ),
            Map.entry(
                    "27778238",
                    List.of(
                            new SeedMenuPick("퍼펙트 2인 세트", 23900, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20260222_254%2F17717298403303pekS_PNG%2F1771475886094%25281%2529.png"),
                            new SeedMenuPick("소고기 쌀국수", 11000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20251030_1%2F1761827298177unKVI_JPEG%2FKakaoTalk_20251030_154307709_17.jpg"),
                            new SeedMenuPick("공심채 소고기 덮밥", 12000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20251030_94%2F1761827308678Byoeq_JPEG%2FKakaoTalk_20251030_154307709_19.jpg")
                    )
            ),
            Map.entry(
                    "1605018985",
                    List.of(
                            new SeedMenuPick("팟타이", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20210923_187%2F1632397606644qwjR5_JPEG%2FgvH5y2THr90PTAjqYC-B0g_l.jpg"),
                            new SeedMenuPick("매운 쌀국수", 9500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211007_145%2F1633595859797WEeMu_JPEG%2FJLv9uAUA2Y7PX19_9y86FuCi.jpg"),
                            new SeedMenuPick("똠얌 쌀국수", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20211007_239%2F1633594306322CG91W_JPEG%2FoFVRVkWrxgFKomp0boH7LPqO.jpg")
                    )
            ),
            Map.entry(
                    "182767122",
                    List.of(
                            new SeedMenuPick("차돌박이 쌀국수", 10000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20241226_47%2F17352017657129aivw_JPEG%2F1%25C2%25F7%25B5%25B9%25B9%25DA%25C0%25CC%25BD%25D2%25B1%25B9%25BC%25F6.jpg"),
                            new SeedMenuPick("양지 쌀국수", 11500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20241226_10%2F173520192122869655_JPEG%2F2%25BE%25E7%25C1%25F6%25BD%25D2%25B1%25B9%25BC%25F6.jpg"),
                            new SeedMenuPick("힘줄 쌀국수", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20241226_291%2F1735201883430ELxV2_JPEG%2F5%25C8%25FB%25C1%25D9%25BD%25D2%25B1%25B9%25BC%25F6.jpg")
                    )
            ),
            Map.entry(
                    "1286204634",
                    List.of(
                            new SeedMenuPick("뿌팟퐁커리", 26000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230426_220%2F1682519332453oOSJR_JPEG%2FB1D0052A-2725-486E-B61E-0556E5D3E767.jpeg"),
                            new SeedMenuPick("팟타이", 14000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230426_227%2F16825193104665fsor_JPEG%2F190965C6-AA2B-466A-AA05-FCF906EA9A8C.jpeg"),
                            new SeedMenuPick("똠얌 쌀국수", 17000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230421_93%2F16820066578872nSN5_JPEG%2F5B3CF1EB-1E3F-4817-9119-723B64703533.jpeg")
                    )
            ),
            Map.entry(
                    "758126508",
                    List.of(
                            new SeedMenuPick("팟타이 꿍", 13000, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230428_296%2F1682665958959znfhR_JPEG%2F5.%25C6%25CC%25C5%25B8%25C0%25CC%25B2%25E1_2.jpg"),
                            new SeedMenuPick("맑은 소고기 쌀국수", 10500, "https://search.pstatic.net/common/?src=https%3A%2F%2Fldb-phinf.pstatic.net%2F20230428_20%2F1682665960230GuCFS_JPEG%2F7.%25B8%25BC%25C0%25BA_%25BC%25D2%25B0%25ED%25B1%25E2_%25BD%25D2%25B1%25B9%25BC%25F6_2.jpg"),
                            new SeedMenuPick("뿌빳 뽕 커리", 24000, "https://naverbooking-phinf.pstatic.net/20250524_146/1748065762432boRzY_JPEG/%B8%F0%B4%D7%B1%DB%B7%CE%B8%AE%BC%BC%C6%AE.jpg?type=f459_345_60_sharpen")
                    )
            )
    );

    private SeedMenuPickData() {
    }

    public static List<SeedMenuPick> findByKakaoPlaceId(String kakaoPlaceId) {
        return MENUS_BY_KAKAO_PLACE_ID.getOrDefault(kakaoPlaceId, List.of());
    }

    public static Map<String, List<SeedMenuPick>> findAll() {
        return MENUS_BY_KAKAO_PLACE_ID;
    }

    public static String findRestaurantNameByKakaoPlaceId(String kakaoPlaceId) {
        return RESTAURANT_NAMES_BY_KAKAO_PLACE_ID.get(kakaoPlaceId);
    }
}
