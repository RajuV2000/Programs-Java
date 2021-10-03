import jdk.internal.net.http.frame.WindowUpdateFrame;

class MncUtil
{
    public static void main(String a[])
    {
        Infosys inf = new Infosys();
        inf.name = "Infosys";
        inf.ceo = "Salil Parekh";
        inf.headQrtrs = "Bengaluru";
        inf.established = 1981 ;
        inf.revnue = 598604.10;
        String mes = inf.message();
        System.out.println(mes);
        inf.display();

        Tcs tcs = new Tcs();
        tcs.name = "Tata Consultancy Services";
        tcs.ceo = "Rajesh Gopinathan";
        tcs.headQrtrs = "Mumbai";
        tcs.established = 1968;
        tcs.revnue = 1163018.74;
        tcs.display();

        Wipro wp = new Wipro();
        wp.name = "Wipro";
        wp.ceo = "Thierry Delaporte";
        wp.headQrtrs = "Bengaluru";
        wp.established = 1945;
        wp.revnue = 61943.10;
        wp.display();

        MaruthiSuzuki ms = new MaruthiSuzuki();
        ms.name = "Maruthi Suzuki";
        ms.ceo = "Kenichi Ayukawa";
        ms.headQrtrs = "New Delhi";
        ms.established = 1982;
        ms.revnue = 78994.00;
        ms.display();

        Birla ba = new Birla();
        ba.name = "Aditya Birla Group";
        ba.ceo = "Ajay Srinivasan";
        ba.headQrtrs = "Mumbai";
        ba.established = 1857;
        ba.revnue = 4600.00;
        ba.display();

        Micromax mx = new Micromax();
        mx.name = "Micromax limited";
        mx.ceo = "Rahul Sharma";
        mx.headQrtrs = "Gurugram";
        mx.established = 2000;
        mx.revnue = 22368.79;
        mx.display();

        BharatForge bh = new BharatForge();
        bh.name = "Bharat Forge";
        bh.ceo = "Mr B N Kalyani";
        bh.headQrtrs = "Pune";
        bh.established = 1961;
        bh.revnue = 8243.71;
        bh.display();

        Britannia br = new Britannia();
        br.name = "Britannia Industries";
        br.ceo = "Varun Berry";
        br.headQrtrs = "Bengaluru";
        br.established = 1892;
        br.revnue = 11878.95;
        br.display();

        Colgate cl = new Colgate();
        cl.name = "Colgate Palmolive limited";
        cl.ceo = "Noel Wallace";
        cl.headQrtrs = "Mumbai";
        cl.established = 1806;
        cl.revnue = 1569.3;
        cl.display();

        Ongc on = new Ongc();
        on.name = "ONGC";
        on.ceo = "Subhash Kumar";
        on.headQrtrs = "New Delhi";
        on.established = 1956;
        on.revnue = 374000.00;
        on.display();

        Bharti be = new Bharti();
        be.name = "Bharti Enterprises";
        be.ceo = "Sunil Bharti Mittal";
        be.headQrtrs = "New Delhi";
        be.established = 1976;
        be.revnue = 16.5;
        be.display();

        Hindhustan hm = new Hindhustan();
        hm.name = "Hindhustan Motors";
        hm.ceo = "Prakash Sahu";
        hm.headQrtrs = "Kolkata";
        hm.established = 1942;
        hm.revnue = 12.18;
        hm.display();

        Dabur db = new Dabur();
        db.name = "Dabur";
        db.ceo = "Mohit Malhotra";
        db.headQrtrs = "Ghaziabad";
        db.established = 1884;
        db.revnue = 8989.00;
        db.display();

        Unilever hu = new Unilever();
        hu.name = "Hindustan Unilever Limited";
        hu.ceo = "Sanjeev Mehta";
        hu.headQrtrs = "Mumbai";
        hu.established = 1933;
        hu.revnue = 40415.00;
        hu.display();

        Essel es = new Essel();
        es.name = "Essel Propack";
        es.ceo = "Anand Kripalu";
        es.headQrtrs = "Mumbai";
        es.established = 25634;
        es.revnue = 2773.00;
        es.display();

    }
}