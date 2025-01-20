# Java Core (семинары)
## Урок 3. Классы и объекты

<br><br>

### Домашняя работа

<br><br>
1. Написать прототип компаратора - метод внутри класса сотрудника, 
сравнивающий две даты, представленные в виде трёх чисел ```гггг-мм-дд```, без использования условного оператора.
<br>

2. Опишите класс руководителя, наследник от сотрудника. 
- Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, 
чтобы он мог поднять заработную плату всем, кроме руководителей. 
- В основной программе создайте руководителя и поместите его в общий массив сотрудников. 
- Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

<br><br>

### Решение

```Main.Employee.java``` - класс сотрудника с методом компаратора для сравнения двух дат.<br>
```Main.Manager.java``` - класс руководителя, наследник от класса сотрудника.<br>
```Main.java``` - основной файл, где создаются данные руководителя и массив сотрудников,<br>
   &nbsp; &ensp; а также выполняется задание - повышение зарплаты всем сотрудникам, кроме руководителя.<br>
