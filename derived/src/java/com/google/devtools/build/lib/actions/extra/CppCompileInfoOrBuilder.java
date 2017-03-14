// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bazel-out/local-fastbuild/bin/src/main/protobuf/libextra_actions_base_java_proto_srcjar.srcjar.preprocessed/extra_actions_base.proto

package com.google.devtools.build.lib.actions.extra;

public interface CppCompileInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blaze.CppCompileInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string tool = 1;</code>
   */
  boolean hasTool();
  /**
   * <code>optional string tool = 1;</code>
   */
  java.lang.String getTool();
  /**
   * <code>optional string tool = 1;</code>
   */
  com.google.protobuf.ByteString
      getToolBytes();

  /**
   * <code>repeated string compiler_option = 2;</code>
   */
  java.util.List<java.lang.String>
      getCompilerOptionList();
  /**
   * <code>repeated string compiler_option = 2;</code>
   */
  int getCompilerOptionCount();
  /**
   * <code>repeated string compiler_option = 2;</code>
   */
  java.lang.String getCompilerOption(int index);
  /**
   * <code>repeated string compiler_option = 2;</code>
   */
  com.google.protobuf.ByteString
      getCompilerOptionBytes(int index);

  /**
   * <code>optional string source_file = 3;</code>
   */
  boolean hasSourceFile();
  /**
   * <code>optional string source_file = 3;</code>
   */
  java.lang.String getSourceFile();
  /**
   * <code>optional string source_file = 3;</code>
   */
  com.google.protobuf.ByteString
      getSourceFileBytes();

  /**
   * <code>optional string output_file = 4;</code>
   */
  boolean hasOutputFile();
  /**
   * <code>optional string output_file = 4;</code>
   */
  java.lang.String getOutputFile();
  /**
   * <code>optional string output_file = 4;</code>
   */
  com.google.protobuf.ByteString
      getOutputFileBytes();

  /**
   * <pre>
   * Due to header discovery, this won't include headers unless the build is
   * actually performed. If set, this field will include the value of
   * "source_file" in addition to the headers.
   * </pre>
   *
   * <code>repeated string sources_and_headers = 5;</code>
   */
  java.util.List<java.lang.String>
      getSourcesAndHeadersList();
  /**
   * <pre>
   * Due to header discovery, this won't include headers unless the build is
   * actually performed. If set, this field will include the value of
   * "source_file" in addition to the headers.
   * </pre>
   *
   * <code>repeated string sources_and_headers = 5;</code>
   */
  int getSourcesAndHeadersCount();
  /**
   * <pre>
   * Due to header discovery, this won't include headers unless the build is
   * actually performed. If set, this field will include the value of
   * "source_file" in addition to the headers.
   * </pre>
   *
   * <code>repeated string sources_and_headers = 5;</code>
   */
  java.lang.String getSourcesAndHeaders(int index);
  /**
   * <pre>
   * Due to header discovery, this won't include headers unless the build is
   * actually performed. If set, this field will include the value of
   * "source_file" in addition to the headers.
   * </pre>
   *
   * <code>repeated string sources_and_headers = 5;</code>
   */
  com.google.protobuf.ByteString
      getSourcesAndHeadersBytes(int index);
}
