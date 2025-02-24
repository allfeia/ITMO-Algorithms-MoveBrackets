### Задача 1: Перемещай скобки

Вам задана скобочная последовательность 𝑠 длины 𝑛, где 𝑛 четное (без остатка делится на 2). Строка 𝑠 состоит из 𝑛2 открывающих скобок '(' и 𝑛2 закрывающих скобок ')'.

За один ход вы можете выбрать ровно одну скобку и передвинуть ее в начало или в конец строки (т.е. вы можете выбрать некоторый индекс 𝑖, удалить 𝑖-й символ из 𝑠 и вставить его перед или после всех остальных символов в 𝑠).

Ваша задача — найти минимальное количество ходов, необходимое, чтобы получить правильную скобочную последовательность из 𝑠. Можно доказать, что ответ всегда существует при данных ограничениях.

Напомним, что такое правильная скобочная последовательность:

«()» — правильная скобочная последовательность;
если 𝑠 — правильная скобочная последовательность, то «(» + 𝑠 + «)» — правильная скобочная последовательность;
если 𝑠 и 𝑡 — правильные скобочные последовательности, то 𝑠 + 𝑡 — правильная скобочная последовательность.
Например, «()()», «(())()», «(())» и «()» являются правильными скобочными последовательностями, а «)(», «()(» и «)))» — нет.

Вам нужно ответить на 𝑡 независимых наборов тестовых данных.

#### Входные данные
Первая строка теста содержит одно целое число 𝑡 (1≤𝑡≤2000) — количество наборов тестовых данных. Затем следуют 𝑡 наборов тестовых данных.

Первая строка набора тестовых данных содержит одно целое число 𝑛 (2≤𝑛≤50) — длину 𝑠. Гарантируется, что 𝑛 четное. Вторая строка набора тестовых данных содержит строку 𝑠, состоящую из 𝑛2 открывающих и 𝑛2 закрывающих скобок.

#### Выходные данные
Для каждого набора тестовых данных выведите ответ на него — минимальное количество ходов, необходимое, чтобы получить правильную скобочную последовательность из 𝑠. Можно доказать, что ответ всегда существует при данных ограничениях.

### Пример
входные данные:</br>
4</br>
2</br>
)(</br>
4</br>
()()</br>
8</br>
())()()(</br>
10</br>
)))((((())</br>

выходные данные:
1</br>
0</br>
1</br>
3
