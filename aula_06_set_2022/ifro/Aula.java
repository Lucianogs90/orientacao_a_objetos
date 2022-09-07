package aula_06_set_2022.ifro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Aula {
    public LocalDate data;
    public ZonedDateTime horario;
    public String turma;
    public String curso;
    public String bloco;
    public int sala;
    private boolean ativa;

    public void ativar_aula(){
        this.ativa = true;
    }

    public void desativar_aula(){
        this.ativa = false;
    }

    public void mostrar_status(){
        System.out.println("Data: " + this.data);
        System.out.println("Horário: " + this.horario);
        System.out.println("Turma: " + this.turma);
        System.out.println("Curso: " + this.curso);
        System.out.println("Bloco: " + this.bloco);
        System.out.println("Sala: " + this.sala);
        System.out.println("Ativa: " + this.ativa);
    }

    public static void main(String[] args) {
        
        LocalDate c = LocalDate.of(2022, Month.SEPTEMBER, 05); 
        LocalDateTime h = LocalDateTime.of(2022, Month.SEPTEMBER, 05, 20, 55, 00);
        ZoneId zone = ZoneId.of("America/Manaus");
        ZonedDateTime z = ZonedDateTime.of(h, zone);
        
        Aula a1 = new Aula();
        a1.data = c;
        a1.horario = z;
        a1.turma = "2021/2";
        a1.curso = "ADS";
        a1.bloco = "A";
        a1.sala = 3;
        a1.ativa = false;

        a1.ativar_aula();
        a1.mostrar_status();

        System.out.println("");
        
        a1.desativar_aula();
        a1.mostrar_status();

    }
}

