// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Dog.proto

package com.example.grpc.server.grpcserver.dog;

public interface ProtoDogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.server.grpcserver.dog.ProtoDog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string breed = 1;</code>
   */
  java.lang.String getBreed();
  /**
   * <code>string breed = 1;</code>
   */
  com.google.protobuf.ByteString
      getBreedBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int32 price = 4;</code>
   */
  int getPrice();
}