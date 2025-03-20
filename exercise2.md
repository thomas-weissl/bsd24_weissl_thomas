# Konfigurationsmanagement Übung 2

## Befehle:

- git config
    - der erste Befehl der ausgeführt werden sollte, da man mit dem Befehl die config von GIT ändern kann.
    
    ```bash
    git config --global user.name "Thomas Weissl"
    ```
    
- git init
    - Neben git clone ist dass der 2te Befehl oder der 1te, wenn man die config nicht geändert hat
    - Dieser Befehl wird benutzt um ein leeres Repository lokal zu erstellen, obwohl man ganz einfach über Github eines erstellen könnte.
    
    ```bash
    git init
    ```
    
- git commit
    - Mit diesem Befehl kann man die Files, welche man mit git add in den Staging Bereich gebracht hat, auf das Repo commiten.
        
        ```bash
        git commit -m "irgendeine commit Nachricht"
        ```
        
- git status
    - Zeigt den Status deines Repositories. Kann eingesetzt werden wann man möchte.
    
    ```bash
    git status
    ```
    
- git add
    - Das ist der nächste Befehl der nach git init bestenfalls ausgeführt werden sollt
    - Mit diesem Befehl wird eine Datei oder ein Ordner in den Staging Bereich gebracht. Dieser ist einfach nur ein Zwischenspeicher.
        
        ```bash
        git add <filename>
        ```
        
- git log
    - Dieser Befehl zeigt alle commits eines Repositorys an
    
    ```bash
    git log
    ```
    
- git diff
    - Zeigt die Veränderungen zwischen deinem Working Directory und deinem Staging Bereich
    
    ```bash
    git diff
    ```
    
- git pull
    - Wird verwendet um Änderungen, welche am Repository getätigt worden sind, auf das Lokale Projekt zu holen
    
    ```bash
    git pull
    ```
    
- git push
    - Wird verwendet um Änderungen, welche vom Lokalen Projekt commited worden sind, auf das Repository zu pushen.
    
    ```bash
    git push
    ```
    
- git branch
    - Mit diesem Befehl kann man branches erstellen, welche dazu genutzt werden, damit man Parallel ohne Veränderungen am Main-Branch arbeiten kann
    
    ```bash
    git branch "branch name"
    ```
    
- git checkout
    - Es ist ein vielfältiger Befehle, da man damit zwischen Branches switchen kann, neue Branches erstellen kann und auch veränderungen wieder rückgängig machen kann
    
    ```bash
    git checkout -b "branch name"
    git checkout -b "neuer branch name"
    ```
    
- git merge
    - Um branches zusammenzufügen
    
    ```bash
    git merge "branch name"
    git merge -d "branch name"
    ```