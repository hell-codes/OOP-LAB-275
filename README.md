<div align="center">

# 🧬 OOP-LAB-275

### Object-Oriented Programming — Lab Repository
**Amrita Vishwa Vidyapeetham, Chennai Campus**

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)
![UML](https://img.shields.io/badge/Diagrams-UML-purple?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

> *A structured collection of Object-Oriented Programming concepts, lab exercises, UML diagrams, and case studies — built from the ground up as part of the BTech CS curriculum.*

</div>

---

## 📁 Repository Structure

```
OOP-LAB-275/
│
├── 📂 LAB_1/                    # Introductory lab exercises
│
├── 📂 Constructor/              # Constructor types & overloading
│
├── 📂 Inheritance/              # Single, multilevel & hierarchical inheritance
│
├── 📂 Abstraction/              # Abstract classes & interfaces
│
├── 📂 Polymorphism/
│   ├── 📂 Overloading/          # Compile-time polymorphism
│   └── 📂 Overriding/           # Runtime polymorphism
│
├── 📂 UML-Diagram/
│   ├── 📂 Class Diagram/        # Class relationships & structure
│   ├── 📂 Sequence Diagram/     # Interaction flow over time
│   └── 📂 Use Case Diagram/     # System actors & use cases
│
├── 📂 Case_Study/               # Real-world OOP design problems
│
├── 📄 LICENSE
└── 📄 README.md
```

---

## 🧠 Concepts Covered

| Concept | Description | Status |
|---------|-------------|--------|
| 🏗️ **Constructors** | Default, Parameterized, Copy constructors | ✅ Done |
| 🧬 **Inheritance** | IS-A relationship, method reuse across classes | ✅ Done |
| 🎭 **Abstraction** | Hiding implementation, exposing essentials | ✅ Done |
| 🔁 **Overloading** | Same method name, different parameters (compile-time) | ✅ Done |
| 🔄 **Overriding** | Redefining parent method in child class (runtime) | ✅ Done |
| 📊 **UML Diagrams** | Class, Sequence, and Use Case diagrams | ✅ Done |
| 🧪 **Case Studies** | Applied OOP for real-world systems | ✅ Done |

---

## 🔑 Key OOP Pillars

```
┌─────────────────────────────────────────────────────┐
│              4 Pillars of OOP                       │
│                                                     │
│  🔒 Encapsulation  →  Data hiding via access mods  │
│  🎭 Abstraction    →  Show what's needed, hide rest │
│  🧬 Inheritance    →  Reuse & extend parent class   │
│  🔄 Polymorphism   →  One interface, many forms     │
└─────────────────────────────────────────────────────┘
```

---

## 📌 Highlights

### 🔁 Polymorphism — Overloading vs Overriding

```java
// ✅ Overloading — Compile-time Polymorphism
class Calculator {
    int add(int a, int b)           { return a + b; }
    double add(double a, double b)  { return a + b; }
    int add(int a, int b, int c)    { return a + b + c; }
}

// ✅ Overriding — Runtime Polymorphism
class Animal {
    void speak() { System.out.println("Some sound..."); }
}

class Dog extends Animal {
    @Override
    void speak() { System.out.println("Woof! 🐶"); }
}
```

---

### 🧬 Inheritance

```java
class Vehicle {
    String brand;
    void start() { System.out.println(brand + " is starting..."); }
}

class Car extends Vehicle {
    int seats;
    void showInfo() {
        System.out.println("Car: " + brand + ", Seats: " + seats);
    }
}
```

---

### 🎭 Abstraction

```java
abstract class Shape {
    abstract double area();   // must be implemented by subclasses

    void display() {
        System.out.println("Area: " + area());
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }

    @Override
    double area() { return Math.PI * radius * radius; }
}
```

---

## 📊 UML Diagrams

The `UML-Diagram/` folder contains hand-crafted diagrams for:

- **Class Diagram** — Shows class structure, attributes, methods, and relationships (association, aggregation, composition, inheritance)
- **Sequence Diagram** — Depicts how objects interact over time with message flow
- **Use Case Diagram** — Captures actors and their interactions with the system

> 📌 Diagrams are created using **PlantUML** syntax for clarity and version control compatibility.

---

## 🗂️ Case Studies

Real-world problems modeled using OOP principles:

| System | Key OOP Concepts Used |
|--------|----------------------|
| 🏧 ATM System | Encapsulation, Abstraction |
| 🏥 Hospital Management | Inheritance, Polymorphism |
| 🛒 E-Commerce Platform | Interface, Overriding |
| 🚆 Railway Reservation | Abstraction, Association |
| 📱 Social Media App | Inheritance, Composition |

---

## 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/hell-codes/OOP-LAB-275.git

# Navigate into the project
cd OOP-LAB-275

# Compile any Java file
javac Polymorphism/Overriding/Main.java

# Run it
java Main
```

> **Prerequisites:** Java JDK 8+ installed | Any IDE (VS Code / IntelliJ / Eclipse)

---

## 👤 Author

<div align="center">

**Prabin Yadav**
BTech Computer Science | Amrita Vishwa Vidyapeetham, Chennai

[![Portfolio](https://img.shields.io/badge/Portfolio-prabinyadav.dev-black?style=for-the-badge&logo=vercel)](https://prabinyadav.dev)
[![GitHub](https://img.shields.io/badge/GitHub-hell--codes-181717?style=for-the-badge&logo=github)](https://github.com/hell-codes)

</div>

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](./LICENSE) file for details.

---

<div align="center">

*Made with ❤️ and a lot of ☕ — turning theory into clean, working code.*

⭐ **Star this repo if it helped you understand OOP better!**

</div>
