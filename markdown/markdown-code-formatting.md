# Code Formatting in Markdown

You can use the following syntax to create code blocks in markdown
This can be useful for demonstrating pieces of code or showing syntax for
markdown without it getting rendered.

# Inline Code Formatting Syntax

```markdown
`[Link Text](URL)`
```

Rendered as:

`[Link Text](URL)`

When rendered, will show the text as written without turing it into a link in
line with the rest of the text

# Code Blocks

Using Triple Backticks

```markdown
` ` `

[Link Text](URL)

` ` `
```

Using Indentation (Four Spaces)

```markdown
    [Link Text](URL)
```

Both rendered as:

```markdown
[Link Text](URL)
```

# Code Blocks - Syntax Highlighting

Many Markdown renderers (but not necessarily all) support syntax highlighting
for code blocks when you specify the programming language immediately after the
opening triple backticks. This applies a color scheme appropriate for the
specified language, making the code easier to read and understand.

````markdown
```python
def hello_world():
    print("Hello, world!")
```
````

````

Rendered as:
```python
def hello_world():
    print("Hello, world!")
````

````markdown
```javascript
function helloWorld() {
  console.log("Hello, world!");
}
```
````

````

Rendered as:
```javascript
function helloWorld() {
    console.log("Hello, world!");
}
````
