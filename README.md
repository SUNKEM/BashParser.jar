BashParser — минималистичный интерактивный шелл на Java, который позволяет выполнять bash-команды прямо из консольного интерфейса Java-приложения.
Отлично подходит для экспериментов, автоматизации и обучения работе с процессами в Java.

🚀 Возможности

Выполнение любых bash-команд через ProcessBuilder

Цветной интерфейс и удобные подсказки

Автоматический вывод результата команды

Завершение с помощью exit или stop

ASCII-баннер при запуске 😎

⚙️ Сборка:
```javac --release 22 BashParser.java```
```jar cfe BashParser.jar BashParser BashParser.class```
```java -jar BashParser.jar```

🧩 Пример работы
```
Shell ready. Type commands ('exit' or 'stop' to quit):

parser@sunkem_1 ~> ls
BashParser
BashParser.jar
LICENSE
README.md

```