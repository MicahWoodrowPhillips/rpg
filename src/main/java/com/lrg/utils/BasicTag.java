package com.lrg.utils;

/**
 * Generic tags for internal listings and categories of things. Things like Male != Female and Up != Down.
 * <p>
 * Entire alphabet and decimal digits added. <br />
 * Do not overload with new constructors or new methods unless absolutely necessary.
 * 
 * @author wphillips
 *
 */
public enum BasicTag
{
    A, // Alpha
    B, // Alpha
    C, // Alpha
    D, // Alpha
    E, // Alpha
    F, // Alpha
    G, // Alpha
    H, // Alpha
    I, // Alpha
    J, // Alpha
    K, // Alpha
    L, // Alpha
    M, // Alpha
    N, // Alpha
    O, // Alpha
    P, // Alpha
    Q, // Alpha
    R, // Alpha
    S, // Alpha
    T, // Alpha
    U, // Alpha
    V, // Alpha
    W, // Alpha
    X, // Alpha
    Y, // Alpha
    Z, // Alpha
    _0, // Numeric Digit
    _1, // Numeric Digit
    _2, // Numeric Digit
    _3, // Numeric Digit
    _4, // Numeric Digit
    _5, // Numeric Digit
    _6, // Numeric Digit
    _7, // Numeric Digit
    _8, // Numeric Digit
    _9; // Numeric Digit

    public int getValue()
    {
        int retVal = 0;

        if (this.toString().length() > 1)
            {
                try 
                {
                    Integer.parseInt(this.toString().substring(1));
                }
                catch (NumberFormatException e)
                {
                }
                catch (IndexOutOfBoundsException e)
                {
                    
                }
                finally {}
            }
        
        
        return retVal;
    }
}
