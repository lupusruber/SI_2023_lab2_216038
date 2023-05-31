## Петар Малиновски 216038


# 2. Control Flow Graph
![Control Flow Graph (1)](https://github.com/lupusruber/SI_2023_lab2_216038/assets/75671111/509d2950-b120-4d1a-bd67-f35f02f1640a)

# 3. Цикломатска комплексност
V = 22 (број на јазли) <br /> 
E = 31 (број на ребра) <br /> 
C = E - V + 2 <br /> 
C = 31 - 22 + 2 = 11 (цикломатска комплексност) <br /> 

# 4. Every Branch критериум
![image](https://github.com/lupusruber/SI_2023_lab2_216038/assets/75671111/ffeb34fb-3f19-4bfa-a003-47d43cf13c7a)

### Тест 1
Проверува дали исправно работи валидацијата за правилен email, бидејќи е внесен email без @ и дали доколку вредноста на полето username e null, дали се зема точно email-от како username, како и дали е валидна големионата на дадениот password.

### Teст 2
Проверува дали исправно работи валидација за уникатен email и дали е валиден внесениот password на корисникот, бидејќи е внесен password поголем од големина 8, со специјални знаци, но без празно место.

### Teст 3
Проверува дали исправно работи проверката за валиден password на корисникот, бидејќи дадениот password е со соодветна должина, но нема празно место, а исто така го содржи username-от во него.

### Тест 4
Тестот проверува што се случува во функцијата доколку во password-от нема специјални знаци ниту празно место, а има внесенот валиден email.

### Тест 5
Проверува дали доколку се испрати аргумент null на местото на user, функцијата ќе фрли соодветен exception.

# 5. Multiple condition критериум
![image](https://github.com/lupusruber/SI_2023_lab2_216038/assets/75671111/a20f0f4d-746f-42d6-b9f4-fca1852a45c2)

Првиот случај е кога внесениот аргумент за user e null, бидејќи доколку во if условот имаме or и во тој or само првиот аргумент е True, не се проверува понатаму, односно условот е усполет.

Вториот случај е кога е внесен User објекти, но тој објект има null вреднсот за соодвеното поле password. Toa значи дека првиот услов во if-от не е исполнет, меѓутоа вториот услов е иполнет, па затоа се фрла exception односно целиот исказ е точен. Третиот услов воошшто не се проверува.

Во третиот и четвртиот случај внесени се user објкети како аргуементи со соодветни username и password аргументи. Разликата е во тоа што на полето за email во третиот Тест случај е пратен null како аргумент и затоа if условот е исполнет па се фрла исклучок, за разлика од посследниот случај каде што е пратен стринг како аргумент за email, па if условот не е исполнет и функцијата продолжува кон јазолот с. 

# Gradle Test
При тестирање на функцијата function се користат истите аргументи за user и allUsers како во табелите. Дадени се две функции, т.ш. во првата се тестира функцијата според everyBranch критериумот, односно изградени се тест примерите за да се изминат сите гранки. А во втората функција се тестира if условот според Multiple Condition критериумот.






