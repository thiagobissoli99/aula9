package br.com.digitalhouse;

import java.util.*;

public class principal {

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa("Tairo" , "Roberto" ,50);
        Pessoa thiago = new Pessoa("Thiago", "Bissoli" , 8);
        Pessoa lucas = new Pessoa("Lucas", "Vinicius",8);

        pessoas.add(tairo);
        pessoas.add(thiago);
        pessoas.add(lucas);

        /*for (Pessoa pessoa : pessoas) {
            System.out.println("nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobreNome() + "\n");

        }*/

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(thiago);
        pessoaSet.add(lucas);
        pessoaSet.add(lucas);
        pessoaSet.add(lucas);

        /*for (Pessoa pessoa : pessoas) {
            System.out.println("nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobreNome() + "\n");

        }*/

        HashMap<String, Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("tairo", tairo);
        pessoaMap.put("thiago",thiago);
        pessoaMap.put("Lucas",lucas);

        for (String chave : pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() +
            "\nSobrenome " + pessoaMap.get(chave).getSobreNome() + "\n");
        }


        Map<Integer , String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "ovos");
        loteriaDosSonhos.put(1, "Agua");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "fogo");

        for (int chave : loteriaDosSonhos.keySet())
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave));


        Map<String , List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add ("fissura");
        apelidosJoao.add ("Maromba");
        apelidosJoao.add ("Juan");

        List<String > apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Nigth Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add ("tampinha");

        apelidos.put("joao", apelidosJoao);
        apelidos.put ("miguel" , apelidosMiguel);

        for (String chave : apelidos.keySet()){
            System.out.println("Apelidos do: " + chave);
            for (String apelido : apelidos.get(chave)){
                System.out.println("\t" + apelido);
            }

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(5);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(8);
            list.add(8);

            for (Integer integer : list) {
                System.out.println(integer.toString());

            }



            Set<Integer> list2 = new HashSet<>();
            list2.add(1);
            list2.add(5);
            list2.add(5);
            list2.add(6);
            list2.add(7);
            list2.add(8);
            list2.add(8);
            list2.add(8);

            for (Integer integer : list2) {
                System.out.println(integer.toString());

            }





        }




    }

}
