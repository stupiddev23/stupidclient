package com.jagrosh.discordipc.entities;

public enum Packet$OpCode {
   HANDSHAKE,
   FRAME,
   CLOSE,
   PING,
   PONG;

   public Packet$OpCode() {
   }
}
