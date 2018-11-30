// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.CommandType}
 */
public enum CommandType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Command_Unknown = 0;</code>
   */
  Command_Unknown(0),
  /**
   * <code>Command_Nothing = 1;</code>
   */
  Command_Nothing(1),
  /**
   * <pre>
   * Ask the worker to re-register.
   * </pre>
   *
   * <code>Command_Register = 2;</code>
   */
  Command_Register(2),
  /**
   * <pre>
   * Ask the worker to free files.
   * </pre>
   *
   * <code>Command_Free = 3;</code>
   */
  Command_Free(3),
  /**
   * <pre>
   * Ask the worker to delete files.
   * </pre>
   *
   * <code>Command_Delete = 4;</code>
   */
  Command_Delete(4),
  /**
   * <pre>
   * Ask the worker to persist a file for lineage
   * </pre>
   *
   * <code>Command_Persist = 5;</code>
   */
  Command_Persist(5),
  ;

  /**
   * <code>Command_Unknown = 0;</code>
   */
  public static final int Command_Unknown_VALUE = 0;
  /**
   * <code>Command_Nothing = 1;</code>
   */
  public static final int Command_Nothing_VALUE = 1;
  /**
   * <pre>
   * Ask the worker to re-register.
   * </pre>
   *
   * <code>Command_Register = 2;</code>
   */
  public static final int Command_Register_VALUE = 2;
  /**
   * <pre>
   * Ask the worker to free files.
   * </pre>
   *
   * <code>Command_Free = 3;</code>
   */
  public static final int Command_Free_VALUE = 3;
  /**
   * <pre>
   * Ask the worker to delete files.
   * </pre>
   *
   * <code>Command_Delete = 4;</code>
   */
  public static final int Command_Delete_VALUE = 4;
  /**
   * <pre>
   * Ask the worker to persist a file for lineage
   * </pre>
   *
   * <code>Command_Persist = 5;</code>
   */
  public static final int Command_Persist_VALUE = 5;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CommandType valueOf(int value) {
    return forNumber(value);
  }

  public static CommandType forNumber(int value) {
    switch (value) {
      case 0: return Command_Unknown;
      case 1: return Command_Nothing;
      case 2: return Command_Register;
      case 3: return Command_Free;
      case 4: return Command_Delete;
      case 5: return Command_Persist;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommandType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommandType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommandType>() {
          public CommandType findValueByNumber(int number) {
            return CommandType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return alluxio.grpc.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CommandType[] VALUES = values();

  public static CommandType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CommandType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.CommandType)
}
