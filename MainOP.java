public class MainOP {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Subscriber s1 = new Subscriber("Aldrich");
        Subscriber s2 = new Subscriber("Rodolf");
        Subscriber s3 = new Subscriber("Agustin");

        agency.subscribe(s1);
        agency.subscribe(s2);
        agency.subscribe(s3);

        agency.publishNews("Breaking News: A new discovery!");

        agency.unsubscribe(s2);

        System.out.println("\nAfter Rodolf unsubscribes:");

        agency.publishNews("Breaking News: Technology advances!");
    }
}