# Ладіков Максим, 35 група, перша підгрупа

## ЗАВДАННЯ 1;
**Приклад виконання простої консольної команди**
<br>
Обчислити контрольну суму (хеш) [MD5](https://uk.wikipedia.org/wiki/MD5) для заданого слова (пароля)

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task1.jpg "Скріншот результату")

--- 
## ЗАВДАННЯ 2
**Визначити кількість одиниць у двійковому поданні цілої частини середнього арифметичного значення функції 1000*sin(α) для чотирьох довільних аргументів.**
![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task2.1.jpg "Скріншот результату")
*Програма написана на основі наданого викладачем коду, зі зміненою логікою. Формула тепер рахує y=1000\*(sin(n1)+...+sin(n4))/4, переводить результат у двійковий код, і рахує "1" в отриманому числі*
<br>
[Calc](https://github.com/Adey4k/Practice_OOP/blob/main/src/task2/Calc.java) - клас для виконання обчислень та серіалізації результатів.<br>
[Item2d](https://github.com/Adey4k/Practice_OOP/blob/main/src/task2/Item2d.java) - Клас для збереження вхідних даних та результатів обчислень.<br>
[Main](https://github.com/Adey4k/Practice_OOP/blob/main/src/task2/Main.java) - Головний клас програми.<br>
[MainTest](https://github.com/Adey4k/Practice_OOP/blob/main/src/task2/MainTest.java) - Клас для тестування.<br>
Фрагмент [Javadoc](https://github.com/Adey4k/Practice_OOP/blob/main/images/task2.3.png) документації.<br>
<br>
[Тестування](https://github.com/Adey4k/Practice_OOP/blob/main/src/task2/MainTest.java) програми:
![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task2.2.jpg "Тестування програми")

---
## ЗАВДАННЯ 3
**Поставлені завдання:**
1. Як основа використовувати вихідний текст проекту попередньої лабораторної роботи. Забезпечити розміщення результатів обчислень уколекції з можливістю збереження/відновлення.
2. Використовуючи шаблон проектування Factory Method (Virtual Constructor), розробити ієрархію, що передбачає розширення рахунок додавання
нових відображуваних класів.
3. Розширити ієрархію інтерфейсом "фабрикованих" об'єктів, що представляє набір методів для відображення результатів обчислень.
4. Реалізувати ці методи виведення результатів у текстовому виде.
5. Розробити тареалізувати інтерфейс для "фабрикуючого" методу.<br>
![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task3.1.jpg "Скріншот результату")
*Програма написана на основі кодів з минулої лабораторної робот і наданих викладачем. Тепер програма здатна зберігати інформацію про декілька згенерованих змінних*<br>
[Calc](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/Calc.java) - клас для виконання обчислень та серіалізації результатів.<br>
[Item2d](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/Item2d.java) - Клас для збереження вхідних даних та результатів обчислень.<br>
[Main](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/Main.java) - Головний клас програми.<br>
[MainTest](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/MainTest.java) - Клас для тестування.<br>
[View](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/View.java) - Інтерфейс для візуалізації даних.<br>
[ViewResult](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/ViewResult.java) - Реалізація інтерфейсу View для роботи з результатами обчислень.<br>
Viewable(ViewableResult) - Інтерфейс для створення об'єктів View.<br>
[ViewableResult](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/ViewableResult.java) - Фабрика для створення об'єктів ViewResult.<br>
Фрагмент [Javadoc](https://github.com/Adey4k/Practice_OOP/blob/main/images/task3.3.png) документації.<br>
<br>

[Тестування](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/MainTest.java) програми:

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task3.2.jpg "Тестування програми")

---

## ЗАВДАННЯ 4
**Поставлені завдання:**
1.За основу використовувати вихідний текст проекту попередньої лабораторної роботи Використовуючи шаблон проектування Factory Method
(Virtual Constructor), розширити ієрархію похідними класами, реалізують методи для подання результатів у вигляді текстової
таблиці. Параметри відображення таблиці мають визначатися користувачем.
2.Продемонструвати заміщення (перевизначення, overriding), поєднання (перевантаження, overloading), динамічне призначення методів
(Пізнє зв'язування, поліморфізм, dynamic method dispatch).
3. Забезпечити діалоговий інтерфейс із користувачем.
4. Розробити клас для тестування основної функціональності.
5. Використати коментарі для автоматичної генерації документації засобами javadoc.
![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task4.1.jpg "Скріншот результату")
*Програма написана на основі кодів з минулої лабораторної робот і наданих викладачем. Тепер програма виводить інформацію в таблиці, використовує перевизначення, перевантаження, поліморфізм*<br>
[Calc](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/Calc.java) - клас для виконання обчислень та серіалізації результатів.<br>
[Item2d](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/Item2d.java) - Клас для збереження вхідних даних та результатів обчислень.<br>
[Main](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/Main.java) - Головний клас програми.<br>
[MainTest](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/MainTest.java) - Клас для тестування.<br>
[View](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/View.java) - Інтерфейс для візуалізації даних.<br>
[ViewResult](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/ViewResult.java) - Реалізація інтерфейсу View для роботи з результатами обчислень.<br>
Viewable(ViewableResult) - Інтерфейс для створення об'єктів View.<br>
[ViewableResult](https://github.com/Adey4k/Practice_OOP/blob/main/src/task3/ViewableResult.java) - Фабрика для створення об'єктів ViewResult.<br>
[ViewTable](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/ViewTable.java) - Інтерфейс відповідаючий за відображення таблиці<br>
[ViewableTable](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/ViewableTable.java) - Фабрика для створення WiewTable<br>
<br>
[Тестування](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/MainTest.java) програми:

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task4.2.jpg "Тестування програми")

Використання Перевизначення(override):

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task4.3.jpg "Перевизначення(override)")

Використання Перевантаження (overload):

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task4.4.jpg "Перевантаження (overload)")

Використання Поліморфізму:

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task4.5.jpg "Поліморфізм")

---

## ЗАВДАННЯ 5
## ЗАВДАННЯ 6
## ЗАВДАННЯ 7
