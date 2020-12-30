package com.example.bbar.data

import com.example.bbar.R

class Alchohol_model {
    val al_list =  mutableListOf<alchohol>().apply{
        add(jintonic)
        add(black_russian)
        add(white_russian)
        add(esproso_martini)
        add(bloodymary)
        add(hibol)
        add(hottodi)
        add(jonclean)
        add(sangria)
        add(pinacolada)
        add(vailiscoffee)
        add(blackbelvat)
        add(martini)
        add(alexandetsister)
        add(aroundtheworld)
        add(blonx)
        add(orangeblossom)
        add(bacadi)
        add(mohito)
        add(boston)
        add(bluehwai)
        add(balalaika)
        add(barbaba)
        add(vodcamatini)
        add(manhatan)
        add(godfather)
        add(irishcoffee)
        add(mimosa)
        add(blackntan)
        add(ddao)
        add(magaritha)
        add(matadore)
        add(mokingbird)
        add(sunrise)
        add(amerepiconhibol)
        add(malibucok)
        add(irishbom)
        add(cherry_blossom)
        add(zero)
    }
}
//jin
val martini = alchohol("마티니", R.drawable.matini, "칵테일의 왕중의 왕. 절대 흔들지 말고 저어서 만들 것!"
        ,R.drawable.green,R.drawable.gage_2, R.drawable.gage_1,R.drawable.gage_4,"3단계까지",3,2112)

val jintonic = alchohol("진토닉",R.drawable.jin_tonic, "상쾌한 맛의 칵테일계의 스테디셀러",R.drawable.green,R.drawable.gage_1, R.drawable.gage_1
            ,R.drawable.gage_3,"3단계까지",3,2212)

    val black_russian = alchohol("블랙러시안",R.drawable.black_russian, "위스키에 커피 리큐르인 깔루아를 넣은 칵테일",R.drawable.green,R.drawable.gage_1, R.drawable.gage_3
            ,R.drawable.gage_2,"3단계까지",3,2111)

    val white_russian = alchohol("화이트러시안",R.drawable.white_russian, "블랙 러시안에 크림을 더한 칵테일",
            R.drawable.green,R.drawable.gage_2, R.drawable.gage_3,R.drawable.gage_2,"3단계까지",3,1111)

    val esproso_martini = alchohol("에스프레소마티니",R.drawable.espresso_matini, "블랙 러시안에 에스프레소를 더한 칵테일",
            R.drawable.green,R.drawable.gage_2, R.drawable.gage_3,R.drawable.gage_2,"3단계까지",3,1111)

    val bloodymary = alchohol("블러디메리",R.drawable.bloody_mary, "메리 1세의 별칭을 연상시키는 붉은 빛의 보드카 베이스 칵테일",
            R.drawable.green,R.drawable.gage_4, R.drawable.gage_2,R.drawable.gage_2,"3단계까지",3,3211)

    val alexandetsister = alchohol("알렉산더시스터", R.drawable.alexandersister, "민트리큐르를 활용한 에메랄드 빛 칵테일"
    , R.drawable.green, R.drawable.gage_1, R.drawable.gage_2, R.drawable.gage_4, "3단계", 3, 2211)

    val aroundtheworld = alchohol("어라운드더월드", R.drawable.aroundtheworld, "세계일주를 하는 듯한 상쾌한 칵테일"
        , R.drawable.green, R.drawable.gage_2, R.drawable.gage_2, R.drawable.gage_4, "3단계", 3, 2211)

    val blonx = alchohol("브롱스", R.drawable.blonx, "브롱스 동물원에서 이름을 따온 오렌지빛 칵테일"
        , R.drawable.green, R.drawable.gage_1, R.drawable.gage_2, R.drawable.gage_4, "3단계", 3, 2212)

    val orangeblossom = alchohol("오렌지블라썸", R.drawable.orange_blossom, "순결이라는 꽃말을 가진 이름"
    , R.drawable.green, R.drawable.gage_1, R.drawable.gage_3, R.drawable.gage_3, "3단계", 3, 3113)

//rum
val bacadi = alchohol("바카디", R.drawable.bacadi, "식전 칵테일로 제격"
    , R.drawable.green, R.drawable.gage_1, R.drawable.gage_2, R.drawable.gage_3, "3단계", 3, 3212)

val bluehwai = alchohol("블루하와이", R.drawable.blue_hwai, "푸른 빛의 하와이 맛"
    , R.drawable.green, R.drawable.gage_4, R.drawable.gage_3, R.drawable.gage_3, "3단계", 3, 3113)

val boston = alchohol("보스턴쿨러", R.drawable.boston_cooler, "보스턴의 날씨를 닮은 상쾌함과 시원함"
    , R.drawable.green, R.drawable.gage_3, R.drawable.gage_2, R.drawable.gage_3, "3단계", 3, 3212)

val mohito = alchohol("모히또", R.drawable.mojito, "모히또 가서 몰디브나 한 잔 할까?"
    , R.drawable.green, R.drawable.gage_3, R.drawable.gage_2, R.drawable.gage_3, "3단계", 3, 1213)

val vodcamatini = alchohol("보드카마티니", R.drawable.vodca_matini, "007 제임스본드가 마시는 본드 마티니"
    , R.drawable.green, R.drawable.gage_2, R.drawable.gage_1, R.drawable.gage_4, "3단계", 3, 2212)

val balalaika = alchohol("발랄라이카", R.drawable.balalaika, "거의 완벽에 가깝게 예리한 맛이 났다 -무라카미 하루키 '기사단장 죽이기'"
    , R.drawable.green, R.drawable.gage_1, R.drawable.gage_1, R.drawable.gage_4, "3단계", 3, 3212)

val barbaba = alchohol("바바라", R.drawable.barbara, "초콜릿의 풍미"
    , R.drawable.green, R.drawable.gage_1, R.drawable.gage_3, R.drawable.gage_3, "3단계", 3, 2213)


//wisky
    val hibol = alchohol("하이볼",R.drawable.highball, "위스키에 토닉워터를 더한 칵테일",
            R.drawable.green,R.drawable.gage_2, R.drawable.gage_1,R.drawable.gage_3,"4단계까지",4,1222)

    val hottodi = alchohol("핫토디",R.drawable.hot_toddy, "원기회복과 감기예방에 좋은 따뜻한 칵테일",
            R.drawable.green,R.drawable.gage_2, R.drawable.gage_4,R.drawable.gage_2,"2단계까지",2,2121)

    val jonclean = alchohol("존클린스",R.drawable.john_colins, "클래식 칵테일의 대표 중 하나로 150년의 역사를 가진 칵테일",
            R.drawable.green,R.drawable.gage_3, R.drawable.gage_2,R.drawable.gage_3,"3단계까지",3,1222)

val godfather = alchohol("갓파더",R.drawable.godfather, "절대 거절 못할 제안을 하지 -대부",
    R.drawable.green,R.drawable.gage_1, R.drawable.gage_3,R.drawable.gage_3,"3단계까지",3,2222)

val irishcoffee = alchohol("아이리쉬커피",R.drawable.irishcoffee, "크림 사이로 흘러나오는 커피를 함께",
    R.drawable.green,R.drawable.gage_4, R.drawable.gage_3,R.drawable.gage_2,"3단계까지",3,1221)

val manhatan = alchohol("맨하탄",R.drawable.mahathan, "뉴욕의 노을을 닮은 붉은 빛",
    R.drawable.green,R.drawable.gage_2, R.drawable.gage_3,R.drawable.gage_3,"3단계까지",3,2221)


    //wine
    val mimosa = alchohol("미모사",R.drawable.mimosa, "스파클링 와인에 오렌지 주스를 더한 칵테일",
            R.drawable.green,R.drawable.gage_1, R.drawable.gage_4,R.drawable.gage_1,"2단계까지",2,1141)

    val sangria = alchohol("상그리아",R.drawable.sangria, "레드와인에 다양한 종류의 과일을 넣어 만드는 칵테일",
            R.drawable.green,R.drawable.gage_5, R.drawable.gage_3,R.drawable.gage_2,"4단계까지",4,2141)

    val blackbelvat = alchohol("블랙벨벳",R.drawable.blackvelbet, "레드 와인에 흑맥주를 더한 칵테일",
            R.drawable.green,R.drawable.gage_1, R.drawable.gage_2,R.drawable.gage_2,"2단계까지",2,1243)

    //etc
    val blackntan = alchohol("블랙앤탄",R.drawable.blackandthan, "편의점 맥주 4캔의 행복",
            R.drawable.green,R.drawable.gage_3, R.drawable.gage_1,R.drawable.gage_2,"2단계까지",2,3252)

    val ddao = alchohol("연따오",R.drawable.yhunthao, "마 내 아임니다 -범죄도시",
            R.drawable.green,R.drawable.gage_5, R.drawable.gage_3,R.drawable.gage_2,"4단계까지",4,3252)

val magaritha = alchohol("마가리따",R.drawable.magaritha, "라틴어로 진주라는 뜻을 가진 칵테일",
    R.drawable.green,R.drawable.gage_3, R.drawable.gage_2,R.drawable.gage_2,"4단계까지",4,1252)

val matadore = alchohol("마타도르",R.drawable.matadore, "라틴어로 투우사라는 뜻을 가진 데낄라 베이스 칵테일",
    R.drawable.green,R.drawable.gage_2, R.drawable.gage_4,R.drawable.gage_2,"4단계까지",4,1151)

val mokingbird = alchohol("모킹버드",R.drawable.mokingbird, "박하사탕을 떠올리게 하는 칵테일",
    R.drawable.green,R.drawable.gage_1, R.drawable.gage_2,R.drawable.gage_3,"4단계까지",4,3251)

val sunrise = alchohol("선라이즈",R.drawable.sunrise, "롤링스톤즈의 보컬 믹 재거가 사랑했던 칵테일",
    R.drawable.green,R.drawable.gage_3, R.drawable.gage_4,R.drawable.gage_3,"4단계까지",4,3151)


    //----liqur----
    val pinacolada = alchohol("피나콜라다",R.drawable.pinacolada, "럼을 베이스로 파인애플 주스와 코코넛 밀크를 더한 칵테일",
            R.drawable.green,R.drawable.gage_1, R.drawable.gage_4,R.drawable.gage_2,"2단계까지",2,1233)

    val malibucok = alchohol("말리부콕",R.drawable.malibucoke, "말리부 럼에 콜라를 더한 칵테일",
            R.drawable.green,R.drawable.gage_1, R.drawable.gage_4,R.drawable.gage_2,"3단계까지",3,3231)

    val irishbom = alchohol("아이리쉬밤",R.drawable.irishbam, "베일리스를 베이스로 흑맥주를 더한 칵테일",
            R.drawable.green,R.drawable.gage_2, R.drawable.gage_2,R.drawable.gage_3,"3단계까지",3,3232)
    val vailiscoffee = alchohol("베일리스커피",R.drawable.baileys_coffee, "베일리스를 베이스로 커피와 우유를 더한 칵테일",
        R.drawable.green,R.drawable.gage_2, R.drawable.gage_3,R.drawable.gage_2,"3단계까지",3,1131)

val amerepiconhibol = alchohol("아메르피콘하이볼",R.drawable.amerepiconhibol, "베일리스를 베이스로 커피와 우유를 더한 칵테일",
    R.drawable.green,R.drawable.gage_2, R.drawable.gage_2,R.drawable.gage_2,"3단계까지",3,1233)

val cherry_blossom = alchohol("체리블라섬",R.drawable.cherry_blossom, "어느 계절이든 봄을 느끼게 해주는 칵테일",
    R.drawable.green,R.drawable.gage_2, R.drawable.gage_3,R.drawable.gage_4,"3단계까지",3,3133)
val zero = alchohol("N/A",0, "N/A",0,0, 0
    ,0,"N/A",0,0)