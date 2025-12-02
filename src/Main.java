import classes.*;
import enums.Emotion;
import enums.RecordType;
import exceptions.ChokingException;
import interfaces.Lookable;
import records.Boots;

public class Main {
    public static void main(String[] args) {

        // Адвокат, Сеньор Петрушка, Сеньор Горошек, Мастер Виноградинка
        Lawyer lawyer = new Lawyer("адвокат");
        SeniorPetrushka parsley = new SeniorPetrushka("Сеньор Петрушка");
        SeniorGorosheck peas = new SeniorGorosheck("Сеньор Горошек");
        MasterVinogradinka grape = new MasterVinogradinka("Мастер Виноградинка");

        // Все посмотрели на адвоката ненавистно
        parsley.watch(lawyer, Emotion.HATE);
        peas.watch(lawyer, Emotion.HATE);
        grape.watch(lawyer, Emotion.HATE);

        // Сеньор Петрушка оглядел присутствующих
        parsley.present();

        // Сеньор Петрушка записал в книжечка присутствующих с укором в глазах
        parsley.presentWithReproach(Emotion.REPROACH, RecordType.THELITTLEBOOK);

        // Разразилась гроза с громом, градом, молнией и дождем
        String[] stormComponents = {"громом", "градом", "молнией", "дождем"};
        Thunderstorm Storm = new Thunderstorm(stormComponents);
        Storm.rage();

        // Сеньор Горошек весело подмигнул Сеньор Петрушка
        peas.wink(Emotion.JOYFULLY, parsley);

        // Мастер Виноградинка испытывает бешенство, едва дышит
        try {
            grape.breathing(Emotion.RABIES);
        } catch (ChokingException e) {
            System.err.println(e.getMessage());
            System.err.println("Все последующие действия Мастера Виноградинки невозможны!");
            return;
        }

        // Мастер Виноградинка пристально рассматривает ботинки
        Lookable boots = new Boots("ботинки");
        try {
            grape.see(Emotion.INTENTLY, boots);
        } catch (ChokingException e) {
            System.err.println(e.getMessage());
        }

        // Мастер Виноградинка еще более пристально рассматривает ботинки
        try {
            grape.moreSee(Emotion.INTENTLY, boots);
        } catch (ChokingException e) {
            System.err.println(e.getMessage());
        }

        // Мастер Виноградинка боится, что адвокат подвергнет штрафу
        try {
            grape.afraid(lawyer);
        } catch (ChokingException e) {
            System.err.println(e.getMessage());
        }

    }
}