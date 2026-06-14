# Mini Compiler

A custom compiler project that translates a simplified UI language into HTML and PHP code.

## Project Overview

This project implements a compiler for a custom source language designed to describe user interface components. The compiler performs lexical analysis, syntax analysis, semantic checking, abstract syntax tree construction, symbol table generation, and code generation.

The generated output consists of HTML and PHP files representing the input user interface.

---

# Language Structure

## Classes

Each class contains the following methods:

* generateCode()
* getLine()
* getToken()

### ClassName

Attributes:

* className
* line

Purpose:

* Prevent duplicate class definitions.
* Store line information for error reporting.

### Image

Attributes:

* Token
* ClassName
* link
* onPressed
* Paragraph
* Stack
* line

### Link

Attributes:

* Image
* Id

### OnPressed

Attributes:

* Token
* Id
* line

Purpose:

* Navigate between pages.

### Paragraph

Attributes:

* Token
* line

Purpose:

* Store text descriptions.

### Stack

Attributes:

* onPressed
* Link

Purpose:

* Group interface elements together.

---

# Grammar Rules

The language grammar includes the following productions:

* main
* Void
* class
* extend_class
* class_body
* state
* Widget
* build_brackets
* build_body
* material_body
* home_body
* column_row_body
* children_body
* stacks
* stack
* stack_body
* nested_children_body
* nested_container
* nested_container_body
* attribut
* img
* text
* nav
* onpress_body
* push_body
* builder_brackets
* material_page_route_body

---

# Symbol Table

The symbol table is implemented using a HashMap.

Structure:

```text
Key   -> Class Name
Value -> Class Contents
```

Purpose:

* Store class definitions.
* Detect duplicate declarations.
* Support semantic analysis.

---

# Abstract Syntax Tree (AST)

Data Structures:

```text
String: Class Name
ArrayList: Classes
```

The AST is generated after successful syntax analysis and is used during code generation.

---

# Target Language

The compiler generates:

* HTML files
* PHP files

The generated pages contain:

* Clickable images
* Navigation links
* Text descriptions
* Page routing functionality

---

# Code Generation

Each class implements a generateCode() method responsible for generating target language code.

Examples:

* Link → generates HTML hyperlink code.
* Image → generates HTML image tags.
* Paragraph → generates HTML text elements.

---

# Error Detection

## Syntax Errors

Examples:

1. Missing "." after Image declaration.
2. Missing ":" after children.

## Semantic Errors

Examples:

1. Duplicate class definitions.
2. Navigation to an undefined class/page.

---

# Compiler Phases

1. Lexical Analysis
2. Syntax Analysis
3. Semantic Analysis
4. Symbol Table Construction
5. AST Construction
6. Code Generation

---

# Features

* Custom language parser
* Semantic validation
* Symbol table implementation
* Abstract Syntax Tree generation
* HTML/PHP code generation
* Syntax and semantic error detection

---

# Technologies Used

* Java
* Compiler Design
* Parsing Techniques
* Abstract Syntax Trees (AST)
* Symbol Tables
* HashMap
* Code Generation

---

# Sample Input & Output

Screenshots of input programs and generated output can be added in the screenshots folder.

## Source Language

![Input](screenshots/input.png)

## Generated Output

![Output](screenshots/output.png)

---

# Academic Project

This project was developed as part of the Information Technology Engineering curriculum and demonstrates the fundamental concepts of compiler construction and code generation.
