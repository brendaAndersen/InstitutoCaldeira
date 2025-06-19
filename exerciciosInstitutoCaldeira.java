// Questão 1
import java.time.LocalDate;

public class Agendamento {
    public static void main(String[] args){
        LocalDate base = LocalDate.of(2025,6,1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());
    }
}

// Questão 2

public class Avaliacao {
    public static void main(String[] args){
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if(media >= 7.0){
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");

        }
    }
}


// Questão 3
public class Item {
    String nome;
    int quantidade;
    
    public Item(String nome){
        this.nome = nome;
        this.quantidade = 1;
    }
    public Item(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public static void main(String[] args){
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);

        System.out.println(x.quantidade + y.quantidade);
    }
}

// Questão 4
int prioridade = 4;
int urgencia = 8;

if(prioridade > 3 && urgencia > 7){
    System.out.println("Tarefa crítica");
} else if(prioridade > 3 || urgencia > 7){
    System.out.println("Tarefa importante");
} else {
    System.out.println("Tarefa comum");
}

// Questão 5
int notificacoes = 0;

for(int i = 1; i <= 5; i++){
    if(i % 2 == 0){
        notificacoes += 2;
    } else {
        notificacoes++;
    }
}
System.out.println(notificacoes);

// Questão 6
ArrayList<String> horarios = new ArrayList<>();
horarios.add("08:00");
horarios.add("10:00");
horarios.add("12:00");
horarios.remove(1);
horarios.add("14:00");

System.out.println(horarios.get(1));

// Questão 7
public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar(){
        emprestado = true;
    }

    public String status(){
        if(emprestado){
            return "Indisponível";
        }
        return "Disponível";
    }
}
Livro l = new Livro();
l.titulo = "Java para iniciantes";

System.out.println(l.status());
l.emprestar();
System.out.println(l.status());

public class Usuario{
    String nome;
    int idade;
    public Usuario(String n, int i){
        nome = n;
        idade = i;
    }
}

// Questão 8
LocalDate hoje = LocalDate.of(2025, 6, 9);
LocalDate prazo = hoje.plusDays(10);
System.out.println(prazo);

// Questão 9
LocalDate data = LocalDate.of(2025, 6, 10);
int diasUteis = 0;

while (diasUteis < 7){
    data = data.plusDays(1);
    boolean fimDeSemana = data.getDayOfWeek() == getDayOfWeek.SATURDAT || data.getDayOfWeek() == getDayOfWeek.SUNDAY;
    boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

    if(!fimDeSemana && !feriado){
        diasUteis++;
    }
}
System.out.println(data);

// Questão 10
LocalTime envio = LocalTime.of(23, 0);
LocalTime limite = LocalTime.of(22, 59);

if(!envio.isBefore(limite)){
    System.out.println("Entrega fora do horário");
} else {
    System.out.println("Tarefa enviada com sucesso");
}

public class Tarefa implements Comparable<Tarefa> {
    String titulo;
    public Tarefa(String titulo){
        this.titulo = titulo;
    }
    public int compareTo(Tarefa outra){
        return this.titulo.compareTo(outra.titulo);
    }

    public static void main(String[] args){
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almoçar"));
        tarefas.add(new Tarefa("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}

// Questão 11 

ArrayList<String> tarefas = new ArrayList<>();
tarefas.add("Estudar Java");
tarefas.add("Fazer exercícios");
tarefas.add("Revisar código");

for(String tarefa : tarefas){
    if(tarefa.contains("Java")){
        System.out.println("Tarefa de programação: " + tarefa);
    }
}
