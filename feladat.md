A nyelv utasításai (amelyek ;-vel záródnak) a következők legyenek:

    Egy kifejezés a következő operátorokkal/műveletekkel, megfelelő precedenciákkal: +, -, *, /, (, ), ABS(), ?:, =, ==, !=, <, >. Az utolsó 4 logikai kifejezés értéke 0 ha nem igaz, 1 ha igaz.
    Legyen benne print(...) utasítás, ami a paraméterül kapott kifejezést, vagy kifejezéseket kiírja.
    Legyen benne scan(...) utasítás, ami a paraméterül kapott változók értékét olvassa be.
    A kifejezés levelében lehet szám (egész és tizedes tört is), lehet változónév (ha eddig nem volt neki érték adva, akkor az értéke legyen 0), és lehet TIME is, ami az aktuális idő (a UNIX idő, azaz az 1970 óta eltelt másodpercek száma).
    Lehessen benne változókat deklarálni int vagy double típusokkal (csak ez a kettő). Nem deklarált változók használata vagy változó újradeklarálása esetén keletkezzen hiba. A változók globálisak, függetlenül attól, hol lettek deklarálva.
    A változódeklaráció is utasítás olyan szempontból, hogy ha nem fut le, akkor nem jön létre az adott változó. Lehessen változót törölni a del utasítással.
    Lehessen benne for és while ciklus C szerű szintaktikával.
    Legyen benne if és switch-case-default utasítás is.
    Legyen megjegyzési (comment) lehetőség.
