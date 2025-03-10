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
<br><br>
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
*Програма написана на основі кодів з минулої лабораторної робот і наданих викладачем. Тепер програма здатна зберігати інформацію про декілька згенерованих змінних*<br><br>
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
<br>
1.За основу використовувати вихідний текст проекту попередньої лабораторної роботи Використовуючи шаблон проектування Factory Method
(Virtual Constructor), розширити ієрархію похідними класами, реалізують методи для подання результатів у вигляді текстової
таблиці. Параметри відображення таблиці мають визначатися користувачем.<br>
2. Продемонструвати заміщення (перевизначення, overriding), поєднання (перевантаження, overloading), динамічне призначення методів
(Пізнє зв'язування, поліморфізм, dynamic method dispatch).<br>
3. Забезпечити діалоговий інтерфейс із користувачем.<br>
4. Розробити клас для тестування основної функціональності. <br>
5. Використати коментарі для автоматичної генерації документації засобами javadoc. <br><br>
![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task4.1.jpg "Скріншот результату")
*Програма написана на основі кодів з минулої лабораторної роботи і наданих викладачем. Тепер програма виводить інформацію в таблиці, використовує перевизначення, перевантаження, поліморфізм*<br><br>
[Calc](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/Calc.java) - клас для виконання обчислень та серіалізації результатів.<br>
[Item2d](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/Item2d.java) - Клас для збереження вхідних даних та результатів обчислень.<br>
[Main](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/Main.java) - Головний клас програми.<br>
[MainTest](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/MainTest.java) - Клас для тестування.<br>
[View](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/View.java) - Інтерфейс для візуалізації даних.<br>
[ViewResult](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/ViewResult.java) - Реалізація інтерфейсу View для роботи з результатами обчислень.<br>
Viewable(ViewableResult) - Інтерфейс для створення об'єктів View.<br>
[ViewableResult](https://github.com/Adey4k/Practice_OOP/blob/main/src/task4/ViewableResult.java) - Фабрика для створення об'єктів ViewResult.<br>
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
**Поставлені завдання:**
<br>
1. Реалізувати можливість скасування (undo) операцій (команд). <br>
2. Продемонструвати поняття "макрокоманда" <br>
3. При розробці програми використовувати шаблон Singletone. <br>
4. Забезпечити діалоговий інтерфейс із користувачем. <br>
5. Розробити клас для тестування функціональності програми. <br> <br>

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task5.1.jpg "Скріншот результату")
*Програма написана на основі кодів з минулої лабораторної роботи. Тепер програма може скасовувати останню дію, використовує макрокоманду, використовує шаблон Singletone* <br><br>

З нового:
[UndoManager](https://github.com/Adey4k/Practice_OOP/blob/main/src/task5/UndoManager.java) - Менеджер скасування(undo) операцій<br>
[MacroCommand](https://github.com/Adey4k/Practice_OOP/blob/main/src/task5/MacroCommand.java) - Макрокоманда для виконання кількой команд одночасно<br>
[Command](https://github.com/Adey4k/Practice_OOP/blob/main/src/task5/Command.java) - Інтерфейс команди <br>
Зміни в [Calc](https://github.com/Adey4k/Practice_OOP/blob/main/src/task5/Calc.java) - клас для виконання обчислень та серіалізації результатів.<br>
Зміни в [Main](https://github.com/Adey4k/Practice_OOP/blob/main/src/task5/Main.java) - головний клас програми.<br>

[Тестування](https://github.com/Adey4k/Practice_OOP/blob/main/src/task5/MainTest.java) програми:

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task5.3.jpg "Тестування програми")

---

## ЗАВДАННЯ 6

**Поставлені завдання:**
<br>
1. Продемонструвати можливість паралельної обробки елементів колекції (пошук мінімуму, максимуму, обчислення середнього значення, відбір за критерієм, статистична обробка тощо).
2. Управління чергою завдань (команд) реалізувати за допомогою шаблону Worker Thread.

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task6.1.jpg "Скріншот результату")
*Програма написана на основі кодів з минулої лабораторної роботи. Тепер програма використовує паралельну обробку елементів колекції для пошуку min, max, avg значень, а також використовує шаблон Worker Thread* <br>


З нового:
[CommandQueue](https://github.com/Adey4k/Practice_OOP/blob/main/src/task6/CommandQueue.java) - Відповідає за обробку потоків <br>
[MinCommand](https://github.com/Adey4k/Practice_OOP/blob/main/src/task6/MinCommand.java) - Рахує мінімальне значення <br>
[MaxCommand](https://github.com/Adey4k/Practice_OOP/blob/main/src/task6/MaxCommand.java) - Рахує максимальне значення <br>
[AvgCommand](https://github.com/Adey4k/Practice_OOP/blob/main/src/task6/AvgCommand.java) - Рахує середнє значення <br>

[Тестування](https://github.com/Adey4k/Practice_OOP/blob/main/src/task6/MainTest.java) програми:

![](https://github.com/Adey4k/Practice_OOP/blob/main/images/task6.2.jpg "Тестування програми")

---

## ЗАВДАННЯ 7
