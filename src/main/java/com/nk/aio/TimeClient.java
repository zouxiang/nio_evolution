package com.nk.aio;

public class                                                                                                                                           TimeClient {
    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                //do nothing
            }
        }
        new Thread(new AsyncTimeClientHandler("127.0.0.1", port), "Aio-AsyncTimeClientHandler-001").start();
    }
}
