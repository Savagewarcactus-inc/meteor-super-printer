package net.numericly.superprinter.utils.tasks;

import org.jetbrains.annotations.NotNull;

import static meteordevelopment.meteorclient.MeteorClient.mc;

import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class PlaceContextNoRotation extends BlockPlaceContext {

    private final boolean isSneaking;

    protected PlaceContextNoRotation(Level level, InteractionHand interactionHand, ItemStack itemStack, BlockHitResult blockHitResult) {
        super(level, null, interactionHand, itemStack, blockHitResult);

        assert mc.player != null;

        this.isSneaking = mc.player.isShiftKeyDown();
    }

    @Override
    public @NotNull Direction getNearestLookingDirection() {
        throw new RuntimeException();
    }

    @Override
    public @NotNull Direction getNearestLookingVerticalDirection() {
        throw new RuntimeException();
    }

    @Override
    public Direction @NotNull [] getNearestLookingDirections() {
        throw new RuntimeException();
    }

    @Override
    public @NotNull Direction getHorizontalDirection() {
        throw new RuntimeException();
    }

    @Override
    public boolean isSecondaryUseActive() {
        return isSneaking;
    }

    @Override
    public float getRotation() {
        throw new RuntimeException();
    }
}
