package com.example.bbar.data

class Alchohol_contents_model {
    val al_list =  mutableListOf<Alchohol_contents>().apply{
        add(jintonic_contents)
        add(black_russian_contents)
        add(white_russian_contents)
        add(esproso_martini_contents)
        add(bloodymary_contents)
        add(hibol_contents)
        add(hottodi_contents)
        add(jonclean_contents)
        add(sangria_contents)
        add(pinacolada_contents)
        add(vailiscoffee_contents)
        add(blackbelvat_contents)
        add(martini_contents)
        add(alexandersister_contents)
        add(aroundtheworld_contents)
        add(blonx_contents)
        add(orangeblossom_contents)
        add(bacadi_contents)
        add(bluehwai_contents)
        add(boston_contents)
        add(mohito_contents)
        add(barbara_contents)
        add(vodcamartini_contents)
        add(balalaika_contents)
        add(godfather_contents)
        add(irishcoffee_contents)
        add(manhatan_contents)
        add(mimosa_contents)
        add(blackandthan_contents)
        add(ddao_contents)
        add(mokingbird_contents)
        add(magaritha_contents)
        add(matadore_contents)
        add(sumrise_contents)
        add(cherryblossom_contents)
        add(amerpiconhibol_contents)
        add(irishbom_contents)
        add(malibucok_contents)
    }
}

//jin
val martini_contents = Alchohol_contents("마티니", arrayOf("진 : 45ml", "토닉워터 : 160ml", "레몬 : 1/8조각")
, arrayOf("1단계 : 잔에 얼음을 넣는다", "2단계 : 토닉워터를 채우고 젓는다", "3단계 : 취향에 따라 조각라임, 슬라이스 레몬 등을 장식한다"))

val jintonic_contents = Alchohol_contents("진토닉", arrayOf("진 : 45ml", "토닉워터 : 적당량", "레몬 1/8조각:"),
    arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 토닉워터를 채우고 젓는다","3단계 : 취향에 따라 조각라임, 슬라이스 레몬등을 장식한다."))

val black_russian_contents = Alchohol_contents("블랙러시안", arrayOf("보드카 : 50ml","깔루아 : 20ml"),
arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 깔루아를 넣는다","3단계 : 보드카를 넣는다"))

val white_russian_contents = Alchohol_contents("화이트러시안", arrayOf("보드카 : 50ml","깔루아 : 20ml","크림 : 적당량"),
arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 깔루아와 보드카를 순서대로 넣어 블랙러시안을 만든다","3단계 : 크림을 올린다.(크림이 없을 경우 우유를 붓는다)"))

val esproso_martini_contents = Alchohol_contents("에스프레소마티니", arrayOf("보드카 : 50ml","깔루아 : 20ml","에스프레소 : 적당량"),
arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 깔루아와 보드카를 순서대로 넣어 블랙러시안을 만든다","3단계 : 에스프레소를 붓는다"))

val bloodymary_contents = Alchohol_contents("블러디메리", arrayOf("보드카 : 45ml","토마토주스 : 적당량","레몬주스 : 4ml","슬라이스 레몬 : 1조각","샐러리 : 적당량","우스터 소스 : 1ml","핫소스 : 1ml","소금 : 작은꼬집","후추 : 작은꼬집"),
arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 샐러리, 레몬, 토마토주스를 제외한 모든 재료를 넣고 젓는다","3단계 : 토마토주스를 붓고 샐러리와 슬라이스 레몬으로 장식한다."))

val alexandersister_contents = Alchohol_contents("알렉산더시스터", arrayOf("드라이 진 : 45ml","페퍼민트 : 15ml","크림 : 15ml"),arrayOf("1단계 : 재료를 모두 넣고 젓는다"))

val aroundtheworld_contents = Alchohol_contents("어라운드더월드", arrayOf("드라이 진 : 40ml","페퍼민트 : 10ml","파인애플 주스 : 15ml","민트 : 1개","체리 : 1개")
    ,arrayOf("1단계 : 재료를 모두 넣고 젓는다", "2단계 : 민트와 체리를 글라스 주위에 장식한다"))

val blonx_contents = Alchohol_contents("브롱스", arrayOf("드라이 진 : 30ml","베르무트 : 10ml","오렌지 주스 : 10ml")
    ,arrayOf("1단계 : 재료를 모두 넣고 젓는다"))

val orangeblossom_contents = Alchohol_contents("오렌지블라썸", arrayOf("드라이진 : 40ml","오렌지 주스 : 20ml")
    ,arrayOf("1단계 : 재료를 모두 넣고 젓는다"))

val bacadi_contents = Alchohol_contents("바카디", arrayOf("바카디 럼 : 45ml", "라임주스 : 15ml", "그레나덴 시럽 : 4ml")
, arrayOf("1단계 : 재료를 모두 넣고 젓는다"))
val bluehwai_contents = Alchohol_contents("블루하와이", arrayOf("럼 : 30ml", "블루 큐라소 : 15ml", "파인애플 주스 : 30ml", "레몬 주스 : 15ml")
    , arrayOf("1단계 : 큰 컵에 얼음을 채운다", "2단계 : 재료를 다른 컵에 모두 넣고 젓는다", "3단계 : 얼음 컵에 옮겨 담는다"))

val boston_contents = Alchohol_contents("보스턴쿨러", arrayOf("럼 : 45ml", "레몬 주스 : 20ml", "설탕 : 3g", "탄산수 : 100ml", "레몬 : 2조각")
    , arrayOf("1단계 : 럼, 레몬주스, 설탕을 컵에 넣고 젓는다", "2단계 : 얼음과 탄산수/진저 에일을 섞는다", "3단계 : 슬라이스 레몬을 얹는다"))
val mohito_contents = Alchohol_contents("모히또", arrayOf("럼 : 45ml", "탄산수 : 200ml", "라임 : 1/2개", "민트 잎 : 4장", "설탕 : 6g")
    , arrayOf("1단계 : 잔에 라임즙을 짠다", "2단계 : 설탕과 민트잎을 넣고 찧는다", "3단계 : 얼음과 럼 그리고 탄산수를 채운다"))
//wisky

val hibol_contents = Alchohol_contents("하이볼", arrayOf("보드카 : 45ml","탄산수 : 160ml","슬라이스 레몬 : 3조각"),
arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 위스키를 붓는다","3단계 : 토닉워터를 붓는다","4단계 : 슬라이스 레몬이나 민트 잎을 넣는다"))

val hottodi_contents = Alchohol_contents("핫토디", arrayOf("위스키 : 45ml","꿀 : 30ml","레몬 즙 : 15ml or 2조각","따뜻한 물 : 200ml","시나몬 스틱 : 1개"),
arrayOf("1단계 : 위스키, 꿀, 레몬즙, 따뜻한 물을 넣고 젓는다","2단계 : 시나몬스틱을 넣어준다"))

val jonclean_contents = Alchohol_contents("존클린스", arrayOf("위스키 : 60ml","레몬 주스 : 20ml","설탕 : 4ml","소다수 : 적당량","레몬 : 1조각", "체리 : 1개"),
arrayOf("1단계 : 위스키, 레몬주스, 설탕을 넣는다","2단계 : 얼음을 넣고 소다수를 채운 후 가볍게 젓는다","3단계 : 슬라이스 레몬, 체리를 핀에 꽃아 장식한다"))

val vodcamartini_contents = Alchohol_contents("보드카마티니", arrayOf("보드카 : 45ml","드라이 베르무트 : 15ml","올리브 : 1개"),
    arrayOf("1단계 : 잔에 보드카와 베르무트를 넣고 젓는다","2단계 : 레몬껍질 혹은 올리브를 곁들인다"))

val balalaika_contents = Alchohol_contents("발랄라이카", arrayOf("보드카 : 30ml","화이트 큐라소 : 15ml","레몬 주스 : 15ml"),
    arrayOf("1단계 : 재료를 모두 넣고 젓는다"))

val barbara_contents = Alchohol_contents("바바라", arrayOf("보드카 : 30ml","크렘드 카카오 : 15ml","생크림 : 15ml"),
    arrayOf("1단계 : 재료를 모두 넣고 젓는다"))

val manhatan_contents = Alchohol_contents("맨하탄", arrayOf("위스키 : 45ml","스위트 베르무트 : 15ml","앙고스트라 비터즈 : 1ml, 체리 : 1개"),
    arrayOf("1단계 : 재료를 모두 넣고 젓는다", "2단계 : 체리를 핀에 꽂아 장식한다"))

val godfather_contents = Alchohol_contents("갓파더", arrayOf("위스키 : 45ml","아마레토 : 15ml"),
    arrayOf("1단계 : 얼음이 든 온더락 글라스에 따르고 저어준다"))

val irishcoffee_contents = Alchohol_contents("아이리쉬커피", arrayOf("위스키 : 30ml","설탕 : 3g","블랙 커피 : 200ml", "생크림 : 50ml"),
    arrayOf("1단계 : 컵에 설탕을 넣는다", "2단계 : 블랙 커피를 70% 넣어 설탕을 녹인 후 위스키를 넣는다", "3단계 : 그 위에 생크림을 3mm정도의 두께로 띄운다"))

//wine

val sangria_contents = Alchohol_contents("상그리아", arrayOf("와인 : 1병","과일 : ", "설탕 : 20g","탄산수 : 1/2"),
arrayOf("1단계 : 껍질을 까지않고 슬라이스한 과일을 통이나 병에 넣은 후 설탕을 조금 넣어준다","2단계 : 와인을 넣고 냉장고에서 하루동안 숙성시킨다","3단계 : 숙성이 끝난 후 와인과 과일을 잔에 반정도 붓는다","4단계 : 탄산수를 잔에 가득 채우고 시원하게 마신다"))

val blackbelvat_contents = Alchohol_contents("블랙벨벳", arrayOf("샴페인 : 1/2","흑맥주 : 1/2" ),
    arrayOf("1단계 : 흑맥주와 샴페인을 순서대로 1대1비율이 되도록 따른다"))

val mimosa_contents = Alchohol_contents("미모사", arrayOf("샴페인 : 1/2","오렌지주스 : 1/2"),
    arrayOf("1단계 : 아주 차가운 오렌지 주스와 샴페인을 순서대로 1:1비율이 되도록 따른다"))

val blackandthan_contents = Alchohol_contents("블랙앤탄", arrayOf("호가든 : 1/2","기네스 흑맥주 : 1/2"),
    arrayOf("1단계 : 호가든을 잔에 거품이 나도록 절반 따른다", "2단계 : 숟가락을 뒤집어 기네스를 천천히 따른다"))

val ddao_contents = Alchohol_contents("연따오", arrayOf("칭따오 : 150ml","연태 고량주 : 30ml"),
    arrayOf("1단계 : 연태고량주와 칭따오를 순서대로 1대5의 비율로 따른다"))

val mokingbird_contents = Alchohol_contents("모킹버드", arrayOf("데낄라 : 30ml","페퍼민트 : 15ml", "라임 주스 : 15ml"),
    arrayOf("1단계 : 재료를 모두 넣고 젓는다"))

val matadore_contents = Alchohol_contents("마타도르", arrayOf("데낄라 : 30ml","파인애플주스 : 45ml", "라임 주스 : 15ml"),
    arrayOf("1단계 : 얼음을 넣고 재료를 모두 넣고 젓는다"))

val magaritha_contents = Alchohol_contents("마가리따", arrayOf("데낄라 : 30ml","화이트큐라소 : 15ml", "라임 주스 : 15ml", "소금 : 잔 둘레"),
    arrayOf("1단계 : 글라스 주위를 소금으로 스노스타일 한다", "2단계 : 재료를 모두 넣고 젓는다"))

//----liqur----
val pinacolada_contents = Alchohol_contents("피나콜라다", arrayOf("말리부 럼 : 30ml","코코넛 밀크 : 30ml","파인애플 주스 : 60ml"), arrayOf("1단계 : 잔에 얼음을 넣는다(크러쉬드 아이스-편의점 얼음컵 추천)","2단계 : 재료를 모두 넣고 젓는다"))

val vailiscoffee_contents = Alchohol_contents("베일리스커피", arrayOf("베일리스 : 30ml","우유 : 30ml","에스프레소 : 1샷"), arrayOf("1단계 : 잔에 얼음을 넣는다","2단계 : 베일리스와 우유를 순서대로 넣는다","3단계 : 에스프레소를 넣는다"))

val sumrise_contents = Alchohol_contents("선라이즈", arrayOf("데낄라 : 45ml","오렌지주스 : 90ml", "그레나덴 시럽 : 8ml", "오렌지 : 1조각"),
    arrayOf("1단계 : 글라스에 얼음을 넣고 데낄라와 오렌지 주스를 따른다", "2단계 : 그레나덴 시럽을 천천히 가라앉힌 다음 오렌지를 곁들인다"))

val malibucok_contents = Alchohol_contents("말리부콕", arrayOf("말리부 럼 : 1/3","콜라 : 2/3"),
    arrayOf("1단계 : 잔에 얼음을 넣고 콜라와 말리부를 순서대로 1대2의 비율로 따른다"))

val irishbom_contents = Alchohol_contents("아이리쉬밤", arrayOf("기네스 흑맥주 : 150ml","베일리스 : 30ml"),
    arrayOf("1단계 : 글라스에 기네스를 2/3만큼 채운다", "2단계 : 소주잔 혹은 샷잔에 베일리스를 넣는다", "3단계 : 잔을 글라스에 떨어트린다"))

val amerpiconhibol_contents = Alchohol_contents("아메르피콘하이볼", arrayOf("아메르피콘 : 45ml","그레나덴시럽 : 3ml", "탄산수 : 100ml"),
    arrayOf("1단계 : 컵에 얼음과 탄산수를 제외한 재료를 넣고 젓는다", "2단계 : 탄산수를 채우고 레몬으로 마무리한다"))

val cherryblossom_contents = Alchohol_contents("체리블라섬", arrayOf("체리브랜디 : 30ml","브랜디 : 30ml", "오렌지큐라소 : 2ml", "그레난데시럽 : 2ml"),
    arrayOf("1단계 : 재료를 모두 넣고 젓는다"))
