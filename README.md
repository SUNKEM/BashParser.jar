<p align="center">
  <img src="https://img.shields.io/badge/Java-Parser-orange?style=for-the-badge&logo=openjdk">
  <img src="https://img.shields.io/badge/Bash-Shell-blue?style=for-the-badge&logo=gnubash">
  <img src="https://img.shields.io/github.com/SUNKEM/BashParser.jar/blob/main/LICENSE">
</p>

<h1 align="center">BashParser</h1>

<p align="center">
  <b>Минималистичный интерактивный Bash-шелл на Java.</b><br>
  Выполняй системные команды прямо из консольного интерфейса Java-приложения.  
  Подходит для экспериментов, автоматизации и обучения работе с процессами.
</p>


## 🚀 Возможности

- ⚡ Выполнение **bash-команд** через `ProcessBuilder`
- 🌈 Цветной интерфейс с подсказками
- 💬 Автоматический вывод результата команд
- 🧹 Завершение с помощью `exit` или `stop`


## ⚙️ Установка и запуск

```bash
# Компиляция
javac --release 22 BashParser.java

# Создание .jar
jar cfe BashParser.jar BashParser BashParser.class

# Запуск
java -jar BashParser.jar
````

> 💡 Требуется **Java 22** или выше.
> Если используешь старую JRE — перекомпилируй под нужную версию.


## 💻 Пример работы

```text

Shell ready. Type commands ('exit' or 'stop' to quit):

parser@sunkem_1 ~> ls
BashParser.java
README.md
```

<p align="center">
  <sub>Made with ❤️ by <a href="https://github.com/SUNKEM">SUNKEM</a></sub>
</p>
```
