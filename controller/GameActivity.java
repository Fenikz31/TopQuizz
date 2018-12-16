package com.fenikz.topquizz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fenikz.topquizz.R;
import com.fenikz.topquizz.model.Question;
import com.fenikz.topquizz.model.QuestionBank;

import java.util.ArrayList;
import java.util.Arrays;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mQuestionText;
    private Button mGameAnswer1;
    private Button mGameAnswer2;
    private Button mGameAnswer3;
    private Button mGameAnswer4;

    private Question mQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionText = findViewById(R.id.activity_game_question_text);
        mGameAnswer1 = findViewById(R.id.activity_game_answer1_btn);
        mGameAnswer2 = findViewById(R.id.activity_game_answer2_btn);
        mGameAnswer3 = findViewById(R.id.activity_game_answer3_btn);
        mGameAnswer4 = findViewById(R.id.activity_game_answer4_btn);





    }

    private QuestionBank generateQuestion() {

        Question question1 = new Question("A quel écrivain doit-on le personnage de Boule-de-Suif ? ",
                Arrays.asList("Guy de Maupassant", "Gustave Flaubert", "Honoré de Balzac", "Théodore Rousseau"),
                0);

        Question question2 = new Question("Avec quel chanteur Carole Fredericks & Michael Jones ont-il formé un trio ?",
                Arrays.asList("Patrick Bruel", "Yannick Noah", "Pascal Obispo","J.-J. Goldman " ),
                3);

        Question question3 = new Question("Quel conseil régional est présidé par Ségolène Royal depuis 2004 ? ",
                Arrays.asList("Midi-Pyrénées","Poitou-Charentes ","Auvergne","Corse"),
                1);

        Question question4 = new Question("Comment se prénommait la soeur, sculptrice, de Paul Claudel ?",
                Arrays.asList("Julie","Marie","Camille","Suzanne"),
                2);

        Question question5 = new Question("A quel pape a succédé Jean-Paul II ? ",
                Arrays.asList("François Jorge Mario Bergoglio", "Clément XII Lorenzo Corsini","Jean-Paul Ier","Innocent V Pierre de Tarentaise"),
                2);

        Question question6 = new Question("Dans quel jeu télévisé intervenaient Barjabule et Mironton ?",
                Arrays.asList("Pyramide","Jeopardy","Le Juste Prix","Deschiffres et des lettres"),
                0);

        Question question7 = new Question("Quel nom rime avec Paul-Loup Sulitzer dans 'Foule sentimentale' de Souchon ?",
                Arrays.asList("Cindy Lauper","Claudia Schiffer","Jennifer","Fox Mulder"),
                1);

        Question question8 = new Question("De quel pays Tirana est-elle la capitale",
                Arrays.asList("L'Albanie", "L'Azerbaïdjan","L'Arménie", "Le Nicaragua"),
                0);

        Question question9 = new Question("Comment étaient surnommés les enrôlés de force dans la Wehrmacht ? ",
                Arrays.asList("les on a pas eu le choix","Les on nous a obligé","les nous sommes dégoutés","Les malgré-nous "),
                3);

        Question question10 = new Question("Qui est le père de la fille de Vincent Cassel ?",
                Arrays.asList("L'ex de la mère", "Vincent Cassel", "Mathieu Kassovitz", "Luc Besson"),
                2);

        Question question11 = new Question("De quel groupe Jim Morrison était-il le chanteur ?",
                Arrays.asList("Sex Pistols","The Doors","Kiss","AC/DC"),
                1);

        Question question12 = new Question("Quel est l'impératif du verbe peindre à la 2e personne du pluriel ?",
                Arrays.asList("Peigniez","Peignissiez","Peignîtes","Peignez"),
                3);

        Question question13 = new Question("En géométrie, combien de côtés possède un losange ?",
                Arrays.asList("3","5","4","8"),
                2);

        Question question14 = new Question("Dans quelle ville française se trouve la Cité de l'espace ?",
                Arrays.asList("Toulouse", "Houston", "Kiev", "Hong-Kong"),
                0);

        Question question15 = new Question("Combien de mercenaires combattaient aux côtés de Yul Brynner en 1960 ?",
                Arrays.asList("7","12","6","9"),
                2);

        return new QuestionBank(Arrays.asList(question1, question2, question3, question4,question5, question6, question7, question8, question9, question10, question11,question12,question13, question14,question15));


        /*
                "Dans quelle ville se déroule chaque année le Festival interceltique ? \n" +
                "Lorient \n"

                "Quel nom porte le bateau dont Théodore Géricault peint le radeau ? \n" +
                "La Méduse \n"

                "Sous quel titre français connaît-on le film \"Vertigo\" d'Alfred Hitchcock ? \n" +
                "Sueurs froides \n"

                "Quel comédien est le mari de Mélanie Griffith ? \n" +
                "Antonio Banderas \n"

                "De quoi parle-t-on quand on évoque la robe d'un cheval ? \n" +
                "Son pelage \n"

                "Quel chanteur a longtemps formé un duo avec Art Garfunkel ? \n" +
                "Paul Simon \n"

                "Si ce n'est pas un fruit, qu'est-ce qu'un kiwi ? \n" +
                "Un oiseau \n" +
                "Quel nom porte le siège de la police londonienne ? \n" +
                "Scotland Yard \n" +
                "Quel parti politique a son siège place du Colonel-Fabien à Paris ? \n" +
                "Le PCF \n" +
                "Qui cause des problèmes à Michel Blanc dans \"Grosse Fatigue\" ? \n" +
                "Son sosie \n" +
                "A quel mouvement littéraire sont associés Ronsard et du Bellay ? \n" +
                "La Pléiade \n" +
                "A quelle saison le boeuf est-il le plus fécond ? \n" +
                "Aucune \n" +
                "Où le général de Gaulle prononce-t-il son fameux : \"Je vous ai compris\" ? \n" +
                "Alger ")*/

    }

    private void displayQuestion(final Question question) {
        // Set the text for the question text view and the four buttons
        mQuestionText.setText(question.getQuestion());
        mGameAnswer1.setText(question.getChoiceList()).get(0);
    }

    @Override
    public void onClick(View v) {
        mQuestion = this.generateQuestion();

    }
}
