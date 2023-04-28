//import java.util.Scanner; //Importa a classe Scanner do pacote java.util
//import javax.swing.JOptionPane; //Importa a classe JOptionPane do pacote javax.swing
//import java.util.Random;
//import java.util.ArrayList;

public class Dicas {
    public static void main(String[] args) {
        
        //Comentários:
        //Comentário de uma linha
        //Comentário multi linha*/ 
        
        //Imprimir na tela:
        System.out.print("Mensagem1"); //Imprime sem quebra de linha
        System.out.print("\tMensagem2\n\\t\\n"); //\t é um tab e \n é uma quebra de linha \\permite escrever \ e \n
        System.out.println("Mensagem3\n"); //Imprime com quebra de linha

        //Tipos de dados:
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.printf("verdadeiro: %b \nfalso: %b\n", verdadeiro, falso);
        byte byteCurto = 10;
        System.out.printf("byteCurto: %d\n", byteCurto);        
        short inteiroCurto = 10;
        System.out.printf("inteiroCurto: %d\n", inteiroCurto);
        int inteiro = 10;
        System.out.printf("inteiro: %d\n", inteiro); 
        long inteiroLongo = 1000000000l;
        System.out.printf("inteiroLongo: %d\n", inteiroLongo);
        float flutuante = 10.5f;
        System.out.printf("flutuante: %.2f\n", flutuante);
        double flutuanteLongo = 10.5;
        System.out.printf("flutuanteLongo: %.2f\n", flutuanteLongo);
        char caractere = 'a';
        System.out.printf("caractere: %c\n", caractere);
        String texto = "Texto"; //string é um tipo de dado de referencia, todos outros são tipos primitivos
        System.out.printf("texto: %s\n", texto);

        //Imprimindo de formas diferentes:
        String texto = "Texto";
        boolean verdadeiro = true;
        double flutuanteLongo = 10.5;
        System.out.println(texto);
        System.out.println("Texto1" + "Texto2"); //Concatenação
        System.out.printf("Texto1 %s\n", "Texto2"); //Interpolação
        System.out.printf("Texto1 %s\n", texto); //Interpolação
        System.out.printf("Texto1 %s %s\n", texto, texto); //Interpolação
        System.out.printf("texto" + verdadeiro + flutuanteLongo + texto + "\n"); //Concatenação
        // %d = inteiro, %f = flutuante, %c = caractere, %s = string, %b = booleano
        // %.2f = flutuante com duas casas decimais
        // flags: - = alinhado a esquerda, + = mostra o sinal do numero, 0 = preenche com zeros, , = separa os milhares
        
        
        //Recebendo dados do usuário:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        System.out.println("Você digitou: " + scanner.nextLine());
        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        scanner.nextLine(); //Limpa o buffer
        System.out.println("Digite um apelido:");
        String apelido = scanner.nextLine();
        System.out.println("Nome: " + nome + " Numero: " + numero + " Apelido: " + apelido);
        scanner.close();
        
        //Operadores:
        int a;
        a = 20;
        a = a + 1;
        a += 1;
        a++;
        a--;
        a *= 2;
        a /= 2;
        a -= 3;
        a %= 5;
        System.out.println(a);
        float b;
        b = (float) a/3;
        System.out.println(b);
        
        //Criando uma GUI (Graphical User Interface) com JOptionPane:
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá " + nome);
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        JOptionPane.showMessageDialog(null, "O numero digitado foi: " + numero);

        //Funções matemáticas:
        double a = 3.14;
        double b = -5.0;
        double c = Math.max(a, b);
        double d = Math.min(a, b);
        double e = Math.sqrt(a);
        double f = Math.abs(b);
        double g = Math.round(a);
        double h = Math.ceil(a);
        double i = Math.floor(a);
        double j = Math.pow(b, 2);
        System.out.printf("%f, %f, %f, %f, %f, %f, %f, %f\n", c, d, e, f, g, h, i, j);
        
        //Valores aleatórios:
        double a = Math.random();
        System.out.println(a);
        Random random = new Random();
        int x = random.nextInt(10); //Gera um numero aleatório entre 0 e 9
        System.out.println(x);
        double y = random.nextDouble(); //Gera um numero aleatório entre 0 e 1
        System.out.println(y);

        //Condicionais (if, else if, else):
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if (idade > 18) {
            System.out.println("Maior de idade");
        }
        else if (idade == 18) {
            System.out.println("Tem exatamente 18 anos");
        }
        else {
            System.out.println("Menor de idade");
        }
        scanner.close();

        //Switch case:
        String dia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana: ");
        dia = scanner.nextLine();
        switch (dia) {
            case "segunda":
                System.out.println("Segunda feira");
                break;
            case "terça":
                System.out.println("Terça feira");
                break;
            case "quarta":
                System.out.println("Quarta feira");
                break;
            case "quinta":
                System.out.println("Quinta feira");
                break;
            case "sexta":  
                System.out.println("Sexta feira");
                break;
            case "sabado":
                System.out.println("Sabado feira?");
                break;
            case "domingo":
                System.out.println("Domingo feira?");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
        scanner.close();
        
        //Operdadores Lógicos:
        int a;
        int b = 10;
        int c = 30;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma temperatura: ");
        a = scanner.nextInt();
        if (a > c) {
            System.out.println("Esta calor");
        }
        else if (a >= b && a <= c) {
            System.out.println("Esta agradavel");
        }
        else {
            System.out.println("Esta frio");
        }
        System.out.println("Digite q ou Q:");
        String letra1 = scanner.next();
        if (letra1.equals("q") || letra1.equals("Q")) {
            System.out.println("Você digitou q ou Q");
        }
        else {
            System.out.println("Você não digitou q ou Q");
        }
        System.out.println("Digite p ou P:");
        String letra2 = scanner.next();
        if (!letra2.equals("p") && !letra2.equals("P")) {
            System.out.println("Você não digitou p ou P");
        }
        else {
            System.out.println("Você digitou p ou P");
        }
        scanner.close();
        

        //Laços de repetição (for, while, do while):
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int j = 0;
        while (j < 5) {
            System.out.println(j*10);
            j++;
        }
        int k = 0;
        do {
            System.out.println(k*20);
            k++;
        } while (k < 5);
        for (int l = 0; l < 3; l++) {
            for (int m = 0; m < 3; m++) {
                System.out.println(l + " " + m);
            }
        }
        
        //Arrays (vetores):
        String[] carros1 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carros1[0]);
        carros1[0] = "Opel";
        System.out.println(carros1[0]);
        String[] carros2 = new String[4];
        carros2[0] = "Ferrari";
        carros2[1] = "BMW";
        carros2[2] = "Ford";
        carros2[3] = "Mazda";
        for (int i = 0; i < carros2.length; i++) {
            System.out.println(carros2[i]);
        }

        //Matrizes:
        int[][] numeros = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }
        
        //Métodos de Strings:
        String nome = "João";
        System.out.println(nome.length()); //Tamanho da string
        System.out.println(nome.toUpperCase()); //Tudo maiusculo
        System.out.println(nome.toLowerCase()); //Tudo minusculo
        System.out.println(nome.charAt(0)); //Caractere na posição 0
        System.out.println(nome.indexOf("o")); //Primeira posição do caractere "o"
        System.out.println(nome.lastIndexOf("o")); //Ultima posição do caractere "o"
        System.out.println(nome.substring(1)); //Substring a partir da posição 1
        System.out.println(nome.substring(1, 3)); //Substring entre as posições 1 e 3
        System.out.println(nome.equals("João")); //Verifica se é igual
        System.out.println(nome.equalsIgnoreCase("joão")); //Verifica se é igual ignorando maiusculas e minusculas
        System.out.println(nome.startsWith("J")); //Verifica se começa com "J"
        System.out.println(nome.endsWith("o")); //Verifica se termina com "o"
        System.out.println(nome.replace("o", "a")); //Substitui "o" por "a"
        System.out.println(nome.trim()); //Remove espaços em branco no inicio e no fim
        System.out.println(nome.toCharArray()); //Converte para array de caracteres
        System.out.println(nome.split("o")); //Converte para array de strings
        System.out.println(nome.concat(" Silva")); //Concatena com " Silva"
        System.out.println(nome.contains("o")); //Verifica se contem "o"
        System.out.println(nome.matches("João")); //Verifica se é igual
        System.out.println(nome.isEmpty()); //Verifica se é vazio
        System.out.println(nome.isBlank()); //Verifica se é vazio ou só tem espaços em branco
        System.out.println(nome.compareTo("João")); //Compara com "João"
        System.out.println(nome.compareToIgnoreCase("joão")); //Compara com "joão"

        //Wrapper Classes (podemos usar tipos primitivos como tipos referencias):
        Boolean a = true; //atribuir valores primitivos a tipos referencias é chamado de autoboxing
        Character b = '@';
        Integer c = 10;
        Double d = 3.14;
        String e = "João";
        if(a){ //utilizar o tipo referência como um valor primitivo, é chamado de unboxing
            System.out.println("Verdadeiro");
        }
        if (b == '@'){
            System.out.println("Igual");
        }
        if(c == 10){
            System.out.println("Igual");
        }
        if(d == 3.14){
            System.out.println("Igual");
        }
        if(e == "João"){
            System.out.println("Igual");
        }
        //valores primitivos são mais rápidos, mas não possuem métodos

        //ArrayList (lista de objetos):
        //São vetores que podem mudar de tamanho dinamicamente, podemos adicionar e remover elementos
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("corolla");
        carros.add("civic");
        carros.add("gol");
        carros.set(0, "fusca");
        carros.remove(2);
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        carros.clear();
        System.out.println(carros.size());
        
        //Listas de Listas:
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("mamão");
        ArrayList<String> bebidas = new ArrayList<String>();
        bebidas.add("suco");
        bebidas.add("refrigerante");
        ArrayList<ArrayList<String>> compras = new ArrayList<ArrayList<String>>();
        compras.add(frutas);
        compras.add(bebidas);
        for(int i = 0; i < compras.size(); i++){
            for(int j = 0; j < compras.get(i).size(); j++){
                System.out.println(compras.get(i).get(j));
            }
        }

        //For each loop:
        String[] carros1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : carros1) {
            System.out.println(i);
        }
        System.out.println();
        ArrayList<String> carros2 = new ArrayList<String>();
        carros2.add("corolla");
        carros2.add("civic");
        carros2.add("gol");
        for (String i : carros2) {
            System.out.println(i);
        }
        
        //Métodos:
        ola("gustavo", 10);
        System.out.println(soma(5, 10));
        
        //Overloaded Methods (métodos sobrecarregados):
        System.out.println(soma(5, 10));
        System.out.println(soma(5, 10, 15));
        System.out.println(soma("gustavo", "piccoli"));

        //Contrutor Final:
        //Podemos usar o construtor final para "travar" o valor de um atributo
        final double PI = 3.14159; //geralmente usar maisculo para atributos finais
        System.out.println(PI);

        //Objetos:
        Carro meuCarro1 = new Carro();
        System.out.println(meuCarro1.cor);
        System.out.println(meuCarro1.marca);
        meuCarro1.cor = "azul";
        System.out.println(meuCarro1.cor);
        meuCarro1.dirigir();
        meuCarro1.frear();
        Carro meuCarro2 = new Carro();
        System.out.println(meuCarro2);
        
        //Construtores:
        //Construtores são métodos especiais que são chamados quando um objeto é instanciado (criado)
        Humano humano1 = new Humano("gustavo", 26, 140);
        Humano humano2 = new Humano("arthur", 25, 110);
        System.out.println(humano1.nome);
        humano2.comer();
        humano1.beber();
        
        //Overloades Constructors (construtores sobrecarregados):
        Pizza pizza1 = new Pizza("pan", "tomate", "mussarela", "calabresa");
        Pizza pizza2 = new Pizza("pan", "tomate", "mussarela");
        
        //To String:
        //O método toString() normalmente retorna o endereço de memória do nosso objeto
        //Se quisermos retornar uma representação de string do nosso objeto, podemos sobrescrever o método toString()
        Carro carro = new Carro();
        System.out.println(carro);//imprime o endereço de memória, ou os dados do objeto se o método toString() for sobrescrito
        System.out.println(carro.toString());//faz a mesma coisa que a linha acima

        //Vetores de objetos:
        Humano humano0= new Humano("gustavo", 26, 140);
        Humano humano1 = new Humano("arthur", 25, 110);
        Humano[] pessoas1 = new Humano[2];
        pessoas1[0] = humano0;
        pessoas1[1] = humano1;
        Humano[] pessoas2 = {humano0, humano1};
        

        //Passar objetos como argumentos:
        Pizzaria pizzaria = new Pizzaria("zonatto");
        Pizza pizza1 = new Pizza("pan", "tomate", "mussarela", "calabresa");
        Pizza pizza2 = new Pizza("pan", "tomate", "mussarela");
        pizzaria.AddSabor(pizza1);
        pizzaria.AddSabor(pizza2);
        

        //Static keyword:
        





    }
    
    
    //Métodos:
    //Métodos são usados para executar certas ações, e também são conhecidos como funções
    static void ola(String a, int b){
        System.out.println(a + " " + b);
    }
    static int soma(int a, int b){
        return a + b;
    }
    
    //Overloaded Methods (métodos sobrecarregados):
    //Podemos ter vários métodos com o mesmo nome, desde que tenham diferentes tipos de parâmetros
    static int soma(int a, int b){
        return a + b;
    }
    static int soma(int a, int b, int c){
        return a + b + c;
    }
    static String soma(String a, String b){
        return a + " " + b;
    }
 



}

