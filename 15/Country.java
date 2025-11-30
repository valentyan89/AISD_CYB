public enum Country {
    Australia("Australia, officially the Commonwealth of Australia, is a country comprising the mainland of the Australian continent, the island of Tasmania and numerous smaller islands.\n[N 6] It has a total area of 7,688,287 km2 (2,968,464 sq mi), making it the sixth-largest country in the world and the largest in Oceania.\nAustralia is the world's flattest and driest inhabited continent.\n[17] It is a megadiverse country, and its size gives it a wide variety of landscapes and climates including deserts in the interior and tropical rainforests along the coast."),
    China("China,[h] officially the People's Republic of China (PRC),[i] is a country in East Asia.\nWith a population exceeding 1.4 billion, it is the second-most populous country after India, representing 17.4% of the world population. China is vast; it borders fourteen countries by land[j] across an area of nearly 9.6 million square kilometers (3,700,000 sq mi), making it the third-largest country by land area.\n[k] The country is divided into 33 province-level divisions: 22 provinces,[l] 5 autonomous regions, 4 municipalities, and 2 semi-autonomous special administrative regions.\nBeijing is the country's capital, while Shanghai is its most populous city by urban area and largest financial center. "),
    England("England is a country that is part of the United Kingdom.\nIt is located on the island of Great Britain, of which it covers about 62%, and more than 100 smaller adjacent islands.\nEngland shares a land border with Scotland to the north and another land border with Wales to the west, and is otherwise surrounded by the North Sea to the east, the English Channel to the south, the Celtic Sea to the south-west, and the Irish Sea to the west.\nContinental Europe lies to the south-east, and Ireland to the west.\nAt the 2021 census, the population was 56,490,048. London is both the largest city and the capital. "),
    Russia("Russia,[b] or the Russian Federation,[c] is a country spanning Eastern Europe and North Asia.\nIt is the largest country in the world, and extends across eleven time zones, sharing land borders with fourteen countries.\n[d] With over 140 million people, Russia is the most populous country in Europe and the ninth-most populous in the world.\nIt is a highly urbanised country, with sixteen of its urban areas having more than 1 million inhabitants.\nMoscow, the most populous metropolitan area in Europe, is the capital and largest city of Russia, while Saint Petersburg is its second-largest city and cultural centre. "),
    Dagestan("Dagestan (/ˌdæɡɪˈstæn, -ˈstɑːn/ DAG-i-STA(H)N; Russian: Дагестан; IPA: [dəɡʲɪˈstan]), officially the Republic of Dagestan,[a] is a republic of Russia situated in the North Caucasus of Eastern Europe, along the Caspian Sea. It is located north of the Greater Caucasus, and is a part of the North Caucasian Federal District. The republic is the southernmost tip of Russia, sharing land borders with the countries of Azerbaijan and Georgia to the south and southwest, the Russian republics of Chechnya and Kalmykia to the west and north, and with Stavropol Krai to the northwest. Makhachkala is the republic's capital and largest city; other major cities are Derbent, Kizlyar, Izberbash, Kaspiysk, and Buynaksk. ");
    private final String info;

    Country(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

    @Override
    public String toString() {
        return name();
    }
}
