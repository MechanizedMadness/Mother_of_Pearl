package tcc.MotherOfPearl.dimension.world;

import net.minecraft.util.ChunkCoordinates;

public class PearlPortalPosition extends ChunkCoordinates {
    public long field_85087_d;

    final PearlTeleporter field_85088_e;

    public PearlPortalPosition(PearlTeleporter PearlTeleporter, int par2, int par3, int par4, long par5) {
        super(par2, par3, par4);
        this.field_85088_e = PearlTeleporter;
        this.field_85087_d = par5;
    }
}