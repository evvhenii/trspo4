// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Cashier.proto

package com.example.grpc.server.grpcserver.cashier;

public final class Cashier {
  private Cashier() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_ProtoCashier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_ProtoCashier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_DeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_DeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_DeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_DeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_GetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_GetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_GetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_GetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_CreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_CreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_grpc_server_grpcserver_cashier_CreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_grpc_server_grpcserver_cashier_CreateResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rCashier.proto\022*com.example.grpc.server" +
      ".grpcserver.cashier\"\034\n\014ProtoCashier\022\014\n\004n" +
      "ame\030\001 \001(\t\"\033\n\rDeleteRequest\022\n\n\002id\030\001 \001(\t\" " +
      "\n\016DeleteResponse\022\016\n\006report\030\001 \001(\t\"\014\n\nGetR" +
      "equest\"Y\n\013GetResponse\022J\n\010cashiers\030\001 \003(\0132" +
      "8.com.example.grpc.server.grpcserver.cas" +
      "hier.ProtoCashier\"Z\n\rCreateRequest\022I\n\007ca" +
      "shier\030\001 \001(\01328.com.example.grpc.server.gr" +
      "pcserver.cashier.ProtoCashier\"\034\n\016CreateR" +
      "esponse\022\n\n\002id\030\001 \001(\t2\212\003\n\016CashierService\022v",
      "\n\003get\0226.com.example.grpc.server.grpcserv" +
      "er.cashier.GetRequest\0327.com.example.grpc" +
      ".server.grpcserver.cashier.GetResponse\022\177" +
      "\n\006delete\0229.com.example.grpc.server.grpcs" +
      "erver.cashier.DeleteRequest\032:.com.exampl" +
      "e.grpc.server.grpcserver.cashier.DeleteR" +
      "esponse\022\177\n\006create\0229.com.example.grpc.ser" +
      "ver.grpcserver.cashier.CreateRequest\032:.c" +
      "om.example.grpc.server.grpcserver.cashie" +
      "r.CreateResponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_grpc_server_grpcserver_cashier_ProtoCashier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_grpc_server_grpcserver_cashier_ProtoCashier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_ProtoCashier_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_com_example_grpc_server_grpcserver_cashier_DeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_grpc_server_grpcserver_cashier_DeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_DeleteRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_example_grpc_server_grpcserver_cashier_DeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_example_grpc_server_grpcserver_cashier_DeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_DeleteResponse_descriptor,
        new java.lang.String[] { "Report", });
    internal_static_com_example_grpc_server_grpcserver_cashier_GetRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_example_grpc_server_grpcserver_cashier_GetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_GetRequest_descriptor,
        new java.lang.String[] { });
    internal_static_com_example_grpc_server_grpcserver_cashier_GetResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_example_grpc_server_grpcserver_cashier_GetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_GetResponse_descriptor,
        new java.lang.String[] { "Cashiers", });
    internal_static_com_example_grpc_server_grpcserver_cashier_CreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_example_grpc_server_grpcserver_cashier_CreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_CreateRequest_descriptor,
        new java.lang.String[] { "Cashier", });
    internal_static_com_example_grpc_server_grpcserver_cashier_CreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_example_grpc_server_grpcserver_cashier_CreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_grpc_server_grpcserver_cashier_CreateResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
