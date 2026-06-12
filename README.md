# Lógica Viva

> Educational WebApp for learning programming logic through pseudocode — built for IFSULDEMINAS, Campus Machado.

---

## About

Lógica Viva is a web-based learning tool that bridges the gap between pseudocode and real programming. Students write pseudocode in a structured editor, execute it directly, and see it converted to C/C++ — making the transition to real languages concrete and visual.

Designed for high school and entry-level college students who are taking their first steps in computational thinking.

---

## Features

- **Pseudocode editor** — write logic in a C/C++-based pseudocode syntax with basic validation
- **Execute pseudocode** — compile and run pseudocode, see stdout/stderr output in real time
- **Convert to C/C++** — transform pseudocode into readable C/C++ source code
- **Exercise system** — teachers create and assign exercises; students submit solutions
- **Feedback loop** — teachers review submissions and provide written feedback

---

## Tech Stack

| Layer | Technology                               |
|---|------------------------------------------|
| Backend | Java (Jakarta EE / Servlets)             |
| Frontend | JSP, CSS, JavaScript                     |
| Build | Maven                                    |
| Server | Payara Community                         |
| Desktop wrapper | JCEF ( Java Chromium Embedded Framework) |

---

## Getting Started

### Prerequisites

- JDK 17+
- Maven 3.8+
- Payara Community 6+

### Build

```bash
mvn clean package
```

### Deploy (Payara autodeploy)

Copy the generated `.war` to your Payara autodeploy directory:

```bash
cp target/logica-viva.war $PAYARA_HOME/glassfish/domains/domain1/autodeploy/
```

Or use the Maven Cargo plugin if configured:

```bash
mvn cargo:deploy
```

### Run locally

Start the Payara domain and access:

```
http://localhost:8080/logica-viva
```

---

## Project Structure

```
src/main/java/.../logicaviva/
├── model/      — domain entities (User, Exercise, Submission, ...)
├── engine/     — pseudocode compiler and code converter
├── servlet/    — HTTP request handlers
└── util/       — shared helpers

src/main/webapp/
├── views/      — JSP pages (student/, teacher/)
├── css/        — stylesheets
├── js/         — client-side scripts
└── index.jsp   — entry point
```

Full folder tree in [`docs/folder-tree.md`](docs/folder-tree.md).

---

## UML Diagrams

Located in [`docs/uml/`](docs/uml/):

- `use-case.puml` — actor interactions and system boundary
- `class-diagram.puml` — domain model and engine classes

Render with [PlantUML](https://plantuml.com) or the PlantUML plugin for IntelliJ/VS Code.

---

## Usage

### As a student

1. Log in and open an assigned exercise
2. Write your solution in the pseudocode editor
3. Click **Execute** to run it and check the output
4. Click **Convert** to see the equivalent C/C++ code
5. Submit when ready

### As a teacher

1. Log in and go to the dashboard
2. Create an exercise with a title, description, and deadline
3. Assign it to students
4. Review submissions and leave feedback

---

## Contributing

This is an academic project. If you are a classmate or instructor and want to contribute:

1. Fork the repository
2. Create a branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "feat: describe your change"`
4. Open a pull request

---

## License

<!-- TODO: confirm license with our advisor before publishing -->

---

## Authors

- **Aníbal Siqueira** - *student* - anisiq2008@proton.me
- **Isabela Oliveira** - *student* - isabelaoliveiramelo2009@gmail.com
- **Daniel Henrique** - *student* - TecladoTassinari@gmail.com
- **Hagar** - *Teacher* - [Email]

Developed as part of the coursework at **IFSULDEMINAS — Campus Machado**.