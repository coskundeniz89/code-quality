package com.deniz;

import generated.tckimlik.kpspublic.KPSPublic;
import generated.tckimlik.kpspublic.KPSPublicSoap;

/**
 * Created by Coşkun on 6.2.2017.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Türkiye");

        KPSPublic kpsPublic = new KPSPublic();
        boolean result = kpsPublic.getKPSPublicSoap()
                .tcKimlikNoDogrula(12345678911L,
                "COŞKUN", "DENİZ", 1989);

        System.out.printf(String.valueOf(result));
    }
}
