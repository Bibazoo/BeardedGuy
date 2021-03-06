// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/quest/LoginServerOperations.proto

package quest.protocol;

public final class LoginServerMessage {
  private LoginServerMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AuthOperationOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string login = 1;
    boolean hasLogin();
    String getLogin();
    
    // required string password = 2;
    boolean hasPassword();
    String getPassword();
  }
  public static final class AuthOperation extends
      com.google.protobuf.GeneratedMessage
      implements AuthOperationOrBuilder {
    // Use AuthOperation.newBuilder() to construct.
    private AuthOperation(Builder builder) {
      super(builder);
    }
    private AuthOperation(boolean noInit) {}
    
    private static final AuthOperation defaultInstance;
    public static AuthOperation getDefaultInstance() {
      return defaultInstance;
    }
    
    public AuthOperation getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperation_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperation_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string login = 1;
    public static final int LOGIN_FIELD_NUMBER = 1;
    private java.lang.Object login_;
    public boolean hasLogin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getLogin() {
      java.lang.Object ref = login_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          login_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLoginBytes() {
      java.lang.Object ref = login_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        login_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string password = 2;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    private java.lang.Object password_;
    public boolean hasPassword() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          password_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      login_ = "";
      password_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasLogin()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPassword()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getLoginBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPasswordBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getLoginBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPasswordBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(quest.protocol.LoginServerMessage.AuthOperation prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements quest.protocol.LoginServerMessage.AuthOperationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperation_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperation_fieldAccessorTable;
      }
      
      // Construct using quest.protocol.LoginServerMessage.AuthOperation.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        login_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        password_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return quest.protocol.LoginServerMessage.AuthOperation.getDescriptor();
      }
      
      public quest.protocol.LoginServerMessage.AuthOperation getDefaultInstanceForType() {
        return quest.protocol.LoginServerMessage.AuthOperation.getDefaultInstance();
      }
      
      public quest.protocol.LoginServerMessage.AuthOperation build() {
        quest.protocol.LoginServerMessage.AuthOperation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private quest.protocol.LoginServerMessage.AuthOperation buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        quest.protocol.LoginServerMessage.AuthOperation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public quest.protocol.LoginServerMessage.AuthOperation buildPartial() {
        quest.protocol.LoginServerMessage.AuthOperation result = new quest.protocol.LoginServerMessage.AuthOperation(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.login_ = login_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.password_ = password_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof quest.protocol.LoginServerMessage.AuthOperation) {
          return mergeFrom((quest.protocol.LoginServerMessage.AuthOperation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(quest.protocol.LoginServerMessage.AuthOperation other) {
        if (other == quest.protocol.LoginServerMessage.AuthOperation.getDefaultInstance()) return this;
        if (other.hasLogin()) {
          setLogin(other.getLogin());
        }
        if (other.hasPassword()) {
          setPassword(other.getPassword());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasLogin()) {
          
          return false;
        }
        if (!hasPassword()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              login_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              password_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string login = 1;
      private java.lang.Object login_ = "";
      public boolean hasLogin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getLogin() {
        java.lang.Object ref = login_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          login_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLogin(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        login_ = value;
        onChanged();
        return this;
      }
      public Builder clearLogin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        login_ = getDefaultInstance().getLogin();
        onChanged();
        return this;
      }
      void setLogin(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        login_ = value;
        onChanged();
      }
      
      // required string password = 2;
      private java.lang.Object password_ = "";
      public boolean hasPassword() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPassword(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassword() {
        bitField0_ = (bitField0_ & ~0x00000002);
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      void setPassword(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:quest.protocol.AuthOperation)
    }
    
    static {
      defaultInstance = new AuthOperation(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:quest.protocol.AuthOperation)
  }
  
  public interface AuthOperationResultOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool isSuccess = 1;
    boolean hasIsSuccess();
    boolean getIsSuccess();
    
    // optional .quest.protocol.Character user = 2;
    boolean hasUser();
    quest.protocol.Common.Character getUser();
    quest.protocol.Common.CharacterOrBuilder getUserOrBuilder();
  }
  public static final class AuthOperationResult extends
      com.google.protobuf.GeneratedMessage
      implements AuthOperationResultOrBuilder {
    // Use AuthOperationResult.newBuilder() to construct.
    private AuthOperationResult(Builder builder) {
      super(builder);
    }
    private AuthOperationResult(boolean noInit) {}
    
    private static final AuthOperationResult defaultInstance;
    public static AuthOperationResult getDefaultInstance() {
      return defaultInstance;
    }
    
    public AuthOperationResult getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperationResult_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperationResult_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool isSuccess = 1;
    public static final int ISSUCCESS_FIELD_NUMBER = 1;
    private boolean isSuccess_;
    public boolean hasIsSuccess() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getIsSuccess() {
      return isSuccess_;
    }
    
    // optional .quest.protocol.Character user = 2;
    public static final int USER_FIELD_NUMBER = 2;
    private quest.protocol.Common.Character user_;
    public boolean hasUser() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public quest.protocol.Common.Character getUser() {
      return user_;
    }
    public quest.protocol.Common.CharacterOrBuilder getUserOrBuilder() {
      return user_;
    }
    
    private void initFields() {
      isSuccess_ = false;
      user_ = quest.protocol.Common.Character.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIsSuccess()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasUser()) {
        if (!getUser().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, isSuccess_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, user_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSuccess_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, user_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static quest.protocol.LoginServerMessage.AuthOperationResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(quest.protocol.LoginServerMessage.AuthOperationResult prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements quest.protocol.LoginServerMessage.AuthOperationResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperationResult_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return quest.protocol.LoginServerMessage.internal_static_quest_protocol_AuthOperationResult_fieldAccessorTable;
      }
      
      // Construct using quest.protocol.LoginServerMessage.AuthOperationResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getUserFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        isSuccess_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (userBuilder_ == null) {
          user_ = quest.protocol.Common.Character.getDefaultInstance();
        } else {
          userBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return quest.protocol.LoginServerMessage.AuthOperationResult.getDescriptor();
      }
      
      public quest.protocol.LoginServerMessage.AuthOperationResult getDefaultInstanceForType() {
        return quest.protocol.LoginServerMessage.AuthOperationResult.getDefaultInstance();
      }
      
      public quest.protocol.LoginServerMessage.AuthOperationResult build() {
        quest.protocol.LoginServerMessage.AuthOperationResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private quest.protocol.LoginServerMessage.AuthOperationResult buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        quest.protocol.LoginServerMessage.AuthOperationResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public quest.protocol.LoginServerMessage.AuthOperationResult buildPartial() {
        quest.protocol.LoginServerMessage.AuthOperationResult result = new quest.protocol.LoginServerMessage.AuthOperationResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isSuccess_ = isSuccess_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (userBuilder_ == null) {
          result.user_ = user_;
        } else {
          result.user_ = userBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof quest.protocol.LoginServerMessage.AuthOperationResult) {
          return mergeFrom((quest.protocol.LoginServerMessage.AuthOperationResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(quest.protocol.LoginServerMessage.AuthOperationResult other) {
        if (other == quest.protocol.LoginServerMessage.AuthOperationResult.getDefaultInstance()) return this;
        if (other.hasIsSuccess()) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.hasUser()) {
          mergeUser(other.getUser());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIsSuccess()) {
          
          return false;
        }
        if (hasUser()) {
          if (!getUser().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              isSuccess_ = input.readBool();
              break;
            }
            case 18: {
              quest.protocol.Common.Character.Builder subBuilder = quest.protocol.Common.Character.newBuilder();
              if (hasUser()) {
                subBuilder.mergeFrom(getUser());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setUser(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool isSuccess = 1;
      private boolean isSuccess_ ;
      public boolean hasIsSuccess() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      public Builder setIsSuccess(boolean value) {
        bitField0_ |= 0x00000001;
        isSuccess_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isSuccess_ = false;
        onChanged();
        return this;
      }
      
      // optional .quest.protocol.Character user = 2;
      private quest.protocol.Common.Character user_ = quest.protocol.Common.Character.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          quest.protocol.Common.Character, quest.protocol.Common.Character.Builder, quest.protocol.Common.CharacterOrBuilder> userBuilder_;
      public boolean hasUser() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public quest.protocol.Common.Character getUser() {
        if (userBuilder_ == null) {
          return user_;
        } else {
          return userBuilder_.getMessage();
        }
      }
      public Builder setUser(quest.protocol.Common.Character value) {
        if (userBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          user_ = value;
          onChanged();
        } else {
          userBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setUser(
          quest.protocol.Common.Character.Builder builderForValue) {
        if (userBuilder_ == null) {
          user_ = builderForValue.build();
          onChanged();
        } else {
          userBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeUser(quest.protocol.Common.Character value) {
        if (userBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              user_ != quest.protocol.Common.Character.getDefaultInstance()) {
            user_ =
              quest.protocol.Common.Character.newBuilder(user_).mergeFrom(value).buildPartial();
          } else {
            user_ = value;
          }
          onChanged();
        } else {
          userBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearUser() {
        if (userBuilder_ == null) {
          user_ = quest.protocol.Common.Character.getDefaultInstance();
          onChanged();
        } else {
          userBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public quest.protocol.Common.Character.Builder getUserBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getUserFieldBuilder().getBuilder();
      }
      public quest.protocol.Common.CharacterOrBuilder getUserOrBuilder() {
        if (userBuilder_ != null) {
          return userBuilder_.getMessageOrBuilder();
        } else {
          return user_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          quest.protocol.Common.Character, quest.protocol.Common.Character.Builder, quest.protocol.Common.CharacterOrBuilder> 
          getUserFieldBuilder() {
        if (userBuilder_ == null) {
          userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              quest.protocol.Common.Character, quest.protocol.Common.Character.Builder, quest.protocol.Common.CharacterOrBuilder>(
                  user_,
                  getParentForChildren(),
                  isClean());
          user_ = null;
        }
        return userBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:quest.protocol.AuthOperationResult)
    }
    
    static {
      defaultInstance = new AuthOperationResult(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:quest.protocol.AuthOperationResult)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_quest_protocol_AuthOperation_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_quest_protocol_AuthOperation_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_quest_protocol_AuthOperationResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_quest_protocol_AuthOperationResult_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4src/main/resources/quest/LoginServerOp" +
      "erations.proto\022\016quest.protocol\032%src/main" +
      "/resources/quest/Common.proto\"0\n\rAuthOpe" +
      "ration\022\r\n\005login\030\001 \002(\t\022\020\n\010password\030\002 \002(\t\"" +
      "Q\n\023AuthOperationResult\022\021\n\tisSuccess\030\001 \002(" +
      "\010\022\'\n\004user\030\002 \001(\0132\031.quest.protocol.Charact" +
      "erB$\n\016quest.protocolB\022LoginServerMessage"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_quest_protocol_AuthOperation_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_quest_protocol_AuthOperation_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_quest_protocol_AuthOperation_descriptor,
              new java.lang.String[] { "Login", "Password", },
              quest.protocol.LoginServerMessage.AuthOperation.class,
              quest.protocol.LoginServerMessage.AuthOperation.Builder.class);
          internal_static_quest_protocol_AuthOperationResult_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_quest_protocol_AuthOperationResult_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_quest_protocol_AuthOperationResult_descriptor,
              new java.lang.String[] { "IsSuccess", "User", },
              quest.protocol.LoginServerMessage.AuthOperationResult.class,
              quest.protocol.LoginServerMessage.AuthOperationResult.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          quest.protocol.Common.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
