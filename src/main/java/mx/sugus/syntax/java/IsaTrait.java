package mx.sugus.syntax.java;

import software.amazon.smithy.model.FromSourceLocation;
import software.amazon.smithy.model.shapes.ShapeId;
import software.amazon.smithy.model.traits.StringTrait;

public final class IsaTrait extends StringTrait {

    public static final ShapeId ID = ShapeId.from("mx.sugus.syntax.java#isa");

    private IsaTrait(String action, FromSourceLocation sourceLocation) {
        super(ID, action, sourceLocation);
    }

    public static final class Provider extends StringTrait.Provider<IsaTrait> {
        public Provider() {
            super(ID, IsaTrait::new);
        }
    }
}
