package gregtech.api.fluids;

import gregtech.api.unification.material.type.FluidMaterial;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;
import java.util.Objects;

public class NotConsumedRecipeFluidInput extends FluidStack {

    private final boolean notConsumed;

    public NotConsumedRecipeFluidInput(FluidStack fluidStack, boolean notConsumed) {
        super(fluidStack, fluidStack.amount);
        this.notConsumed = notConsumed;
    }
    public NotConsumedRecipeFluidInput(@Nonnull FluidMaterial fluidMaterial, boolean notConsumed) {
        super(Objects.requireNonNull(fluidMaterial.getMaterialFluid()), 1);
        this.notConsumed = notConsumed;
    }
    public boolean isNotConsumed() {
        return notConsumed;
    }

    @Override
    public NotConsumedRecipeFluidInput copy() {
        return new NotConsumedRecipeFluidInput(this, this.notConsumed);
    }

}
