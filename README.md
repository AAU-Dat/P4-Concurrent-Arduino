# P4-Concurrent-Arduino
Extension of the arduino programming language to handle concurrency.

## Latex Workshop Settings
>Ctrl + Shift + p to open the command palette. Search for seetings as JSON.
```json
"latex-workshop.latex.recipes": [
    {
        "name": "pdflatex, biber, makeglossaries, pdflatex x 2",
        "tools": [
            "pdflatex",
            "biber",
            "makeglossaries",
            "pdflatex",
            "pdflatex"
        ]
    }
],
"latex-workshop.latex.tools": [
    {
        "name": "latexmk",
        "command": "latexmk",
        "args": [
            "--shell-escape",
            "-synctex=1",
            "-interaction=nonstopmode",
            "-file-line-error",
            "-pdf",
            "%DOC%"
        ]
    },
    {
        "name": "pdflatex",
        "command": "pdflatex",
        "args": [
            "--shell-escape",
            "-synctex=1",
            "-interaction=nonstopmode",
            "-file-line-error",
            "%DOC%"
        ]
    },
    {
        "name": "biber",
        "command": "biber",
        "args": [
          "%DOC%"
        ]
    },
    {
        "name": "makeglossaries",
        "command": "makeglossaries",
        "args": [
            "%DOCFILE%"
        ]
    }
]
```