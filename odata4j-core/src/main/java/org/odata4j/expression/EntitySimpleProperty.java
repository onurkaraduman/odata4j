package org.odata4j.expression;

public interface EntitySimpleProperty extends MemberExpression {

  String getPropertyName();
  boolean isSelectionMatch(String propName);
}
