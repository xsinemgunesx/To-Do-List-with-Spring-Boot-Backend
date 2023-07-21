package com.todoList.swagger;

public class SwaggerDescription {

    private SwaggerDescription() {
        throw new IllegalStateException("Utility class");
    }

    public static final String RATE_DESCRIPTION = "**Usage Plan:**\n"
            + "| Rate (requests per 10 second) |\n"
            + "| ---- |\n"
            + "| 50 |\n";


    //region Kullanici
    public static final String KULLANICILARI_GETIR_ACIKLAMA = "Sistemde bulunan tüm kullanıcı listesini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region Proje
    public static final String PROJE_BILGISI_GETIR = "Girilen projeId ye ait proje bilgilerini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String AKTIF_PROJELERI_GETIR = "Aktif projelerin bilgilerini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String TUM_PROJELERI_GETIR = "Sistemde bulunan tüm proje listesini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_YAYINLA = "Girilen projeId ye ait projenin aktiflik değerini Y yapmak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_YAYINDAN_KALDIR = "Girilen projeId ye ait projenin aktiflik değerini N yapmak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_SIL = "Girilen projeId ye ait projeyi silmek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_EKLE = "Girilen proje bilgilerini veri tabanına eklemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DUZENLE = "Girilen projeId ye ait projeyi düzenlemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region ProjeDetay
    public static final String PROJE_DETAY_BILGISI_GETIR = "Girilen projeId ye ait projenin detay bilgilerini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DETAY_BILGISI_DUZENLE = "Girilen projeDetayId ye ait detay bilgilerini güncellemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DETAY_BILGISI_EKLE = "Girilen proje detay bilgilerini veri tabanına ekleyen method.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DETAY_BILGISI_SIL = "Girilen projeDetayId ye ait Proje detay bilgilerini kaldırmak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region ProjeDetayTip
    public static final String PROJE_DETAY_TIPLERI_GETIR = "Girilen proje detay tiplerini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DETAY_TIP_DUZENLE = "Girilen projeDetayTipId ye ait detay tip bilgilsini güncellemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DETAY_TIP_EKLE = "Girilen proje detay tip bilgilerini veri tabanına ekleyen method.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DETAY_TIP_SIL = "Girilen projeDetayTipId ye ait Proje detay tip bilgilerini kaldırmak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region ProjeKoordinat
    public static final String PROJE_KOORDINAT_BILGISI_GETIR = "Girilen projeId ye ait projenin koordinat bilgilerini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_KOORDINAT_BILGISI_EKLE = "Girilen proje koordinat bilgilerini veri tabanına ekleyen method.<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_KOORDINAT_BILGISI_SIL = "Girilen Id ye ait Proje koordinat bilgilerini kaldırmak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region BlokKoordinat
    public static final String BLOK_KOORDINAT_BILGISI_GETIR = "Girilen projeId ye ait blok koordinat bilgilerini almak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String BLOK_KOORDINAT_BILGISI_EKLE = "Girilen blok koordinat bilgilerini veri tabanına ekleyen method.<br /> <br />" + RATE_DESCRIPTION;
    public static final String BLOK_KOORDINAT_BILGISI_SIL = "Girilen Id ye ait blok koordinat bilgilerini kaldırmak için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region Bina
    public static final String BINA_EKLE = "Yeni bina eklemek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String TUM_BINALARI_GETIR = "Projelerdeki tüm binaları getirmek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String BINA_GETIR = "ID si verilen binayı getirmek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJENIN_BINALARINI_GETIR = "Projedeki binaları getirmek için kullanılır.<br /><br />" + RATE_DESCRIPTION;

    public static final String BINA_ADLARINI_GETIR = "Projedeki binaların adlarını getirmek için kullanılır.<br /><br />" + RATE_DESCRIPTION;

    public static final String BINA_DUZENLE = "Binaları düzenlemek için kullanılır.<br /><br />" + RATE_DESCRIPTION;

    //endregion

    //region Daire
    public static final String DAIRE_EKLE = "Yeni daire eklemek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String BINA_DAIRE_GETIR = "Girilen Bina ID sine ait daireleri listelemek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String DAIRE_DUZENLE = "Var olan bir daireyi düzenlemek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String DAIRE_SIL = "Var olan bir daireyi silmek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String PROJE_DAIRE_GETIR = "Proje Id verilen daireleri listelemek için kullanılır<br /> <br />" + RATE_DESCRIPTION;

    //endregion

    //region Tercih
    public static final String UYE_PROJE_TERCHILERI_GETIR = "Girilen Kurum Üye Numarası sahip üyenin projedeki tercihlerini listelemek için kullanılır<br /> <br />" + RATE_DESCRIPTION;
    public static final String TERCIH_BILGILERI_GETIR = "Girilen Kurum Üye Numarasına sahip üyenin tercihlerini listelemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    public static final String PROJE_TERCIHLERI_KAYDET = "Kullanıcının proje ID si verilen  tercihlerini kaydetmek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String UYE_TERCIHLERI_KAYDET = "Kullanıcının tercihlerini kaydetmek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;

    public static final String TUM_TERCIHLERI_GETIR = "Girilen Proje ID'sine göre tüm tercihleri listelemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    public static final String TERCIH_SAYISI_WITH_DAIRE_GETIR = "Girilen projeId ye ait daireleri ve tercih sayılarını listelemek için kullanılır.<br /> <br />" + RATE_DESCRIPTION;
    //endregion
}
