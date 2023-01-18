public class TesteCarro {

    public static void main(String[] args){

        Carro van = new Carro();
        van.marca = "asus";
        van.modelo = "fox";
        van.numPassageiros = 10;
        van.capCombustivel = 70;
        van.consumoCombustivel = 0.35;

        System.out.println(van.marca);
        System.out.println(van.modelo);



    }

}
