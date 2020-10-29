package com.company1;


import java.util.ArrayDeque;
import java.util.Scanner;

public class DrunkMan
{
    private ArrayDeque<Integer> firstPlayerDeck = new ArrayDeque<Integer>(5);
    private ArrayDeque<Integer> secondPlayerDeck = new ArrayDeque<Integer>(5);
    private int rounds;

    public DrunkMan()
    {
        // Автоматическая генерация колод
        randomInput();

        // Ручной ввод колод
        //userInput();

        // Колоды после заполнения
        //outputDecks();

        rounds = 0;
        game();
    }

    private void game()
    {
        int firstPlayerCard;
        int secondPlayerCard;
        while (true)
        {
            // Вскрываем карты
            firstPlayerCard = firstPlayerDeck.pollFirst();
            secondPlayerCard = secondPlayerDeck.pollFirst();

            if (firstPlayerCard > secondPlayerCard)
            {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            }
            else
            {
                secondPlayerDeck.add(secondPlayerCard);
                secondPlayerDeck.add(firstPlayerCard);
            }
            rounds++;

            // Проверка результатов раунда
            // Первый победил
            if (firstPlayerDeck.isEmpty())
            {
                System.out.println("first " + rounds);
                return;
            }
            // Второй победил
            else if (secondPlayerDeck.isEmpty())
            {
                System.out.println("second " + rounds);
                return;
            }
            // 106 безрезультатных раундов
            if (rounds >= 106)
            {
                System.out.println("botva");
                return;
            }
        }
    }

    private void randomInput()
    {
        boolean[] check = new boolean[10];
        int buff;
        int counter = 0;
        while (counter < 10)
        {
            // Генерируем число от 0 до 9
            buff = (int)(Math.random() * 10);
            // Проверка на совпадение
            if (!check[buff])
            {
                check[buff] = true;
                // Добавляем в колоду первого игрока
                if (counter < 5)
                {
                    firstPlayerDeck.add(buff);
                }
                    // Добавляем в колоду второго игрока
                else
                {
                    secondPlayerDeck.add(buff);
                }
                counter++;
            }
        }
    }

    // Ввод значений карт
    private int[] userInputIn()
    {
        Scanner sc = new Scanner(System.in);
        int[] buff = new int[10];
        System.out.println("Колода первого игрока: ");
        for (int i = 0; i < 5; i++)
        {
            buff[i] = sc.nextInt();
        }
        System.out.println("Колода второго игрока: ");
        for (int i = 5; i < 10; i++)
        {
            buff[i] = sc.nextInt();
        }
        return buff;
    }

    // Пользовательский ввод
    private void userInput(){
        boolean check = false;
        int[] buff = new int[10];
        buff = userInputIn();
        // Проверка
        for (int i = 0; i < buff.length; i++)
        {
            // Значение карты
            if (buff[i] < 0 || buff[i] > 9)
            {
                System.out.println("Ошибка.\nНевозможная комбинация карт.\nЗначение карты не может быть меньше 0 или больше 9!\nПовторите ввод");
                check = true;
            }
            for (int j = 0; j < buff.length; j++)
                // На совпадение
                if (buff[i] == buff[j] && j != i)
                {
                    System.out.println("Ошибка.\nНевозможная комбинация карт.\nКарты не могут повторяться!\nПовторите ввод");
                    check = true;
                    break;
                }
            // Если найдена ошибка
            if (check)
            {
                check = false;
                buff = userInputIn();
                i = -1;
            }
        }
        // Запись
        for (int i = 0; i < 5; i++)
        {
            firstPlayerDeck.add(buff[i]);
        }
        for (int i = 5; i < 10; i++)
        {
            secondPlayerDeck.add(buff[i]);
        }
    }

    private void outputDecks(){
        System.out.println("Первый игрок: " + firstPlayerDeck);
        System.out.println("Второй игрок: " + secondPlayerDeck);
    }
}