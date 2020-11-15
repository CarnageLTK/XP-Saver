package xpsaver.xpConverter;

public class ConvertXP {

    public static int levelsToXp(int levels) {
        if (levels <= 16) {
            return (int) (Math.pow(levels, 2) + (6 * levels));
        } else if (levels >= 17 && levels <= 31) {
            return (int) ((2.5 * Math.pow(levels, 2)) + (-40.5 * levels) + 360);
        } else if (levels >= 32) {
            return (int) ((4.5 * Math.pow(levels, 2)) + (-162.5 * levels) + 2220);
        }
        return -1;
    }
}