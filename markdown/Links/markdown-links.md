# Basic Link Syntax

"[Link Text](URL)"

- Link Text: This is the visible part of the link that users will see in the document. It's placed inside square brackets [ ].
- URL: This is the web address or path you want the link to point to. It's placed inside parentheses ( ).

# Example

[Google](https://www.google.com)
In the above example, "Google" is the link text that will be visible, and
clicking on it will take the user to https://www.google.com.

# Linking to Documents or Pages Within a Repository

You can also use relative paths to link to other documents or sections within
the same GitHub repository. This is particularly useful for organizing
documentation or notes.

"[Java Notes](/Java/README.md)"
In this example, clicking on "Java Notes" would take the user to the README file
located in the Java directory of the same repository.

# Linking to Sections Within the Same Document

Markdown allows you to link to specific sections within the same document using
the section title. This is done by replacing spaces with dashes and removing
special characters to create the link target.

"[Go to Index](#index)"

Assuming there's a section titled "Index" in the same document, clicking on
"Go to Index" would take the user directly to that section.
The # symbol followed by the section name (with spaces replaced by dashes and
in lowercase) is used to specify the section you want to link to.
