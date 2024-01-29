package mx.sugus.syntax.java;

import software.amazon.smithy.model.node.Node;
import software.amazon.smithy.model.node.ObjectNode;
import software.amazon.smithy.model.shapes.ShapeId;
import software.amazon.smithy.model.traits.AnnotationTrait;

public final class OptionalTrait extends AnnotationTrait {

    public static final ShapeId ID = ShapeId.from("mx.sugus.syntax.java#optional");

    public OptionalTrait(ObjectNode node) {
        super(ID, node);
    }

    public OptionalTrait() {
        this(Node.objectNode());
    }

    public static final class Provider extends AnnotationTrait.Provider<OptionalTrait> {
        public Provider() {
            super(ID, OptionalTrait::new);
        }
    }
}
