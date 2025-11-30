import java.util.StringTokenizer;

public class Adress {
    private String country, region, city, street, house, id, flat;

    public void AdressDefault(String adrs){
        String[] builder = adrs.split(",");
        this.country = builder[0].trim(); this.region = builder[1].trim(); this.city = builder[2].trim(); this.street = builder[3].trim(); this.house = builder[4].trim(); this.id = builder[5].trim(); this.flat = builder[6].trim();
    }

    public void AdressTokenizer(String adrs){
        StringTokenizer tokens = new StringTokenizer(adrs, ",.;");
        this.country = tokens.nextToken().trim(); this.region = tokens.nextToken().trim(); this.city = tokens.nextToken().trim(); this.street = tokens.nextToken().trim(); this.house = tokens.nextToken().trim(); this.id = tokens.nextToken().trim(); this.flat = tokens.nextToken().trim();
    }

    public void checker(){
        System.out.println(this.country);
        System.out.println(this.region);
        System.out.println(this.city);
        System.out.println(this.street);
        System.out.println(this.house);
        System.out.println(this.id);
        System.out.println(this.flat);
    }
}
