import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        PersFamoso PersFamoso1= new PersFamoso();
        PersFamoso1.setNome("Dwayne");
        PersFamoso1.setCognome("Johnson");
        PersFamoso1.setEta(49);
        PersFamoso1.setSesso("Uomo");


		PersFamoso PersFamoso2= new PersFamoso();
		PersFamoso2.setNome("Chris");
		PersFamoso2.setCognome("Hemsworth");
		PersFamoso2.setEta(38);
		PersFamoso2.setSesso("Uomo");
		
        PersFamoso PersFamoso3= new PersFamoso();
        PersFamoso3.setNome("Robert");
        PersFamoso3.setCognome("Downey Jr.");
        PersFamoso3.setEta(56);
        PersFamoso3.setSesso("Uomo");

        PersFamoso PersFamoso4= new PersFamoso();
        PersFamoso4.setNome("Chris");
        PersFamoso4.setCognome("Evans");
        PersFamoso4.setEta(40);
        PersFamoso4.setSesso("Uomo");


        ArrayList<PersFamoso> famoso= new ArrayList<PersFamoso>();
        
        famoso.add(PersFamoso1);
        famoso.add(PersFamoso2);
        famoso.add(PersFamoso3);
        famoso.add(PersFamoso4);
        
        System.out.println(famoso.get(0).toString());
        System.out.println(famoso.get(1).toString());
        System.out.println(famoso.get(2).toString());
        System.out.println(famoso.get(3).toString());

	}

}
