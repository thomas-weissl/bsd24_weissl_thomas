- [Autor](https://github.com/thomas-weissl?tab=repositories)
- [FH Campus02](https://www.campus02.at/)

# **Wäscherei Programm**
### Beschreibung
Auf jedem Kleidungsstück, des Bundesheers, ist ein Code mit Informationen über dieses Kleidungsstück.

> [name];[Kaserne];[Art des Kleidungsstücks]

Dieser Code kann über einen Scanner in einer Mobileapp eingescannt werden und dieser Datensatz wird auf einer SQLite Datenbank zwischengespeichert. Das Backend läuft auf einem Server. Dort kann man dann die Datensätze, sofern man im Netzwerk ist, zum Backend schicken und diese werden dann auf einer Datenbank gespeichert. Dann kann man per Knopfdruck Lieferscheine für die jeweiligen Kasernen schreiben lassen.

### Installationsanleitung
Zum Installieren des Frontends am Handy, muss das Handy nur am Server angesteckt werden und die App einmal darauf ausgeführt werden.

Zum installieren am Backend wird einfach eine Jar-Datei generiert, welche man ausführen kann.

### Anleitung
Auf dem Backend muss man einfach nur die Jar-Datei ausführen, damit sich eine kleine Java-Swing GUI öffnet, wo es 2 Buttons gibt. Ein Button wird dazu verwendet, dass man die Daten vom Frontend zum Backend schicken kann und ein Button, welcher die Lieferscheine schreiben lässt.

Im Frontend muss man einfach die App ausführen und kann dann sofort mit dem Scannen der Codes beginnen.

### Weitere Infos
- Die Programmiersprache ist [Dart](https://flutter.dev/) mit dem Framework [Flutter](https://flutter.dev/)
- Die Mobile-Applikation ist auf jedem Betriebssystem ausführbar
- Das Backend ist auf jedem Betriebssystem ausführbar
- Das Frontend funktioniert Offline, da die Datensätze erst bei Knopfdruck versendet werden und wenn jedes Device im Netzwerk ist

### Konfigurationen zum anpassen
- [log4j.xml](src/main/resources/log4j2.xml.template)

### Exercises

- [Exercise1](exercise1.md)
- [Exercise2](exercise2.md)
- [Exercise2_Part2](exercise2_part2.md)
- [Exercise3](exercise3.md)
- [Exercise4](exercise4.md)