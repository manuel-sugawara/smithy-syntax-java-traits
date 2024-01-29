$version: "2.0"

namespace mx.sugus.syntax.java

/// Marks a member as constant with the given value.
@trait(selector: "structure > member")
string const

/// Marks a structure as an interface
@trait(selector: "structure")
structure interface {}

/// Marks a structure as instance of the given argument.
@trait(selector: "structure")
string isa

/// Marks any structure with a java type name.
@trait(selector: "*")
string java

/// Marks a member as optional.
@trait(selector: "structure > member")
structure optional {}
